package com.wlk.ideaPlugin.do2sqlmapper;

import com.intellij.ide.plugins.newui.HorizontalLayout;
import com.intellij.lang.FileASTNode;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.popup.*;
import com.intellij.psi.PsiFile;
import com.intellij.ui.components.JBPanel;
import com.wlk.ideaPlugin.do2sqlmapper.classloader.BeanClassLoader;
import com.wlk.ideaPlugin.do2sqlmapper.task.AutoGenerateTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.SystemIndependent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.alibaba.fastjson.JSONObject;

public class RightPopUp extends AnAction {
    private static ExecutorService threadpool = Executors.newSingleThreadExecutor();
    private String packageName  ="";
    private Class<?> cls;
    private JTextField jTextField;


    public JTextField getjTextField() {
        return jTextField;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public void actionPerformed(AnActionEvent e) {

        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        @Nullable PsiFile psiFile = e.getData(LangDataKeys.PSI_FILE);
        String text = psiFile.getText();
//        try {
////            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
        JBPopup popup = createDialogPanel(psiFile);

        popup.showInFocusCenter();

    }


    /**
     * 创建在文件编辑器内右键点击之后回跳出来的提示输入框
     * @return
     */
    public JBPopup  createDialogPanel(PsiFile psiFile){
        JBPopupFactory factory = JBPopupFactory.getInstance();
        JBPanel jbPanel = new JBPanel();
        jbPanel.setLayout(new HorizontalLayout(0));
        JLabel packageLabel = new JLabel("请输入完整包名");
        JTextField packageNameInput = new JTextField(30);



        JButton okBtn = new JButton("确认");

        JButton cancelBtn = new JButton("取消");
        packageLabel.setLabelFor(packageNameInput);

        jTextField = packageNameInput;
        packageNameInput.setFocusable(true);
        jbPanel.add(packageNameInput);
        jbPanel.add(packageLabel);
        jbPanel.add(okBtn);
        jbPanel.add(cancelBtn);

//        JLabel xmlLocationChooserLabel = new JLabel("请设置.xml文件的生成路径");
//        JFileChooser xmlfileChooser = new JFileChooser();
//        xmlfileChooser.setSelectedFile(new File(psiFile.getProject().getBasePath()));
//        xmlfileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        xmlLocationChooserLabel.setLabelFor(xmlfileChooser);
//
//        JLabel javaLocationChooserLabel = new JLabel("请设置.java文件的生成路径");
//
//        JFileChooser javafileChooser = new JFileChooser();
//        javafileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//        javaLocationChooserLabel.setLabelFor(xmlfileChooser);
//        javafileChooser.setSelectedFile(new File(psiFile.getProject().getBasePath()));
//
//        jbPanel.add(xmlfileChooser);
//        jbPanel.add(xmlLocationChooserLabel);
//        jbPanel.add(javafileChooser);
//        jbPanel.add(javaLocationChooserLabel);



        @NotNull ComponentPopupBuilder builder = factory.createComponentPopupBuilder(jbPanel, jbPanel);
        @NotNull JBPopup popup = builder.setResizable(true)
                .setModalContext(false)
                .setFocusable(true)
                .setRequestFocus(true)
                .setCancelOnWindowDeactivation(true)
                .setCancelOnOtherWindowOpen(true)
                .setMovable(true)
                .setCancelKeyEnabled(true)
                .setCancelOnClickOutside(true)
                .setTitle("请完善信息")
                .setMinSize(new Dimension(100,50))
                .setCancelButton(new IconButton("取消", Messages.getInformationIcon()))
                .createPopup();
        OnClickListener listener = new OnClickListener(psiFile,this,popup);
        okBtn.addActionListener(listener);
        cancelBtn.addActionListener(v->{ popup.cancel(); });
        return popup;
    }

    public void setTargetClass(Class<?> cls){
        this.cls  =cls;

    }

    class OnClickListener implements ActionListener {

        private PsiFile psiFile;
        private RightPopUp rightPopUp;

        private JBPopup popup;
        public OnClickListener(PsiFile psiFile, RightPopUp rightPopUp, JBPopup popup ){
            this.psiFile = psiFile;

            this.rightPopUp = rightPopUp;
            this.popup   = popup;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                //WriteCommandAction.runWriteCommandAction();
                rightPopUp.setPackageName(rightPopUp.jTextField.getText());

                System.out.println("packageName :"+packageName);
                popup.cancel();
                PsiFile originalFile = psiFile.getOriginalFile();

                FileASTNode node = psiFile.getNode();
                System.out.println("node is");
                System.out.println(JSONObject.toJSONString(node));
                byte[] targetBuffer = psiFile.getVirtualFile().contentsToByteArray();
                @NotNull String className = psiFile.getVirtualFile().getNameWithoutExtension();
                @NotNull String name = psiFile.getVirtualFile().getName();
                final String[] split = psiFile.getVirtualFile().getName().split("\\.");
                String extendType = split[split.length - 1];


                BeanClassLoader myClassLoader = new BeanClassLoader();
                myClassLoader.setPackageName(packageName);
                myClassLoader.setTargetByte(targetBuffer);
                Class<?> cls = myClassLoader.loadTargetClass(className);
                System.out.println(cls);
                rightPopUp.setTargetClass(cls);
                @Nullable @SystemIndependent String basePath = psiFile.getProject().getBasePath();
                System.out.println("getProject().getBasePath() : " + basePath);
                threadpool.execute(new AutoGenerateTask(cls,packageName,className,basePath));
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("actionPerformed error"+ex);
            }
        }
    }

}
