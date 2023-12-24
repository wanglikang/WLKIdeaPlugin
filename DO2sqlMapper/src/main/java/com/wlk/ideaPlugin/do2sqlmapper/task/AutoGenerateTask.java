package com.wlk.ideaPlugin.do2sqlmapper.task;

import com.wlk.ideaPlugin.do2sqlmapper.BeanGenerateContext;
import com.wlk.ideaPlugin.do2sqlmapper.TableInfo;
import com.wlk.ideaPlugin.do2sqlmapper.util.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AutoGenerateTask implements Runnable {
    private Class<?> cls;
    private String packageName;
    private String beanName;
    private String classFilePath;
    private List<String> idFields = new ArrayList<>();
    private Map<String,String> field2Type = new HashMap<>();
    private String tbName;



    public AutoGenerateTask(Class<?> cls, String packageName, String beanName, String classFilePath) {
        this.cls = cls;
        this.packageName = packageName;
        this.beanName = beanName;
        this.classFilePath = classFilePath;

        System.out.println(cls);
        System.out.println(packageName);
        System.out.println(beanName);
        System.out.println(classFilePath);
    }

    public String getTbNameFromClassName(String className){
        if(className.endsWith("DO")){
            className = className.substring(0,className.length()-2);
            return Utils.ABC2a_b_c(className);
        }else{
            return Utils.ABC2a_b_c(className);
        }
    }
    @Override
    public void run()  {
        try {
        final Field[] fields = cls.getDeclaredFields();
            TableInfo[] annotationsByType = cls.getAnnotationsByType(TableInfo.class);
            System.out.println(annotationsByType);
//        Field[] fields = cls.getFields();

        Object clsInstance = cls.newInstance();

        boolean hasId = false;
        System.out.println("class 的字段有：");
        for (Field field : fields) {
            System.out.println(field);
            String fieldName = field.getName();
            Class<?> ftype = field.getType();

            if(Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) &&  fieldName.equals("tbName")){
                //强制规定若一个字段为static 且 final 且 字段名为 tbName,则此字段的值为对应的数据库表明
//                tbName = fieldName;
                field.setAccessible(true);
                tbName = (String) field.get(clsInstance);
            }else{
                tbName = getTbNameFromClassName(cls.getSimpleName());
            }


            final String[] split = field.getGenericType().getTypeName().split("\\.");

            switch (split[split.length-1]){
                case "int": ;
                case "Integer":field2Type.put(fieldName,"Integer");break;
                case "long": ;
                case "Long": field2Type.put(fieldName,"Long");break;
                case "String":field2Type.put(fieldName,"String");break;
                case "Boolean":field2Type.put(fieldName,"Boolean");break;
                case "Date": field2Type.put(fieldName,"Date");break;
                case "List": field2Type.put(fieldName,"List");break;
                case "Map":field2Type.put(fieldName,"Map");break;

            }
            if(fieldName.equals("id")){
                hasId = true;
                idFields.add(fieldName);
            }

        }
        String generateJavaFilePath = Utils.autoDetectClassPath(classFilePath,packageName)+File.separator+beanName+"Mapper.java";
        String generateXmlFilePath =  Utils.autoDetectClassPath(classFilePath,packageName)+File.separator+beanName+"Mapper.xml";
        System.out.println("生成文件路径："+generateJavaFilePath);
        System.out.println("生成文件路径："+generateXmlFilePath);

        BeanGenerateContext context = new BeanGenerateContext();
        context.setPackageName(packageName);
        context.setBeanName(beanName);
        context.setCls(cls);
        context.setField2Type(field2Type);
        context.setIdFields(idFields);
        context.setTableName(tbName);

        StringBuilder sbjava = new StringBuilder();
        generateJavaMapper(sbjava);
        File fileJAVA = new File(generateJavaFilePath);
        if(!fileJAVA.getParentFile().exists()){
            fileJAVA.getParentFile().createNewFile();
        }

        Writer br = null;
        br = new FileWriter(fileJAVA);
        br.write(sbjava.toString());
        br.flush();
        br.close();

        new Thread(new XMLGenerateTask(context,generateXmlFilePath)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e2){
            e2.printStackTrace();
        }

    }


    /**
     * 生成java的mapper文件，对应为
     * BeanNameMapper.java
     */
    public void generateJavaMapper(StringBuilder sb){
        genereteJavaMapperHeaderPart(sb);
        generateJavaMapperFunctions(sb);
        generateJavaMapperEnd(sb);
    }

    public void genereteJavaMapperHeaderPart(StringBuilder sb){
        sb.append("package "+packageName+" ; \n");
//        sb.append("import java.lang.*;\n");
        sb.append("public interface "+ beanName + " { \n");
    }

    public  void generateJavaMapperFunctions(StringBuilder sb) {

        sb.append("\tLong insert("+beanName +" "+ beanName.toLowerCase() +") ; \n");
        sb.append("\tLong deleteByPrimaryKey(Long id)\n");
        sb.append("\tLong updateByPrimaryKeySelective("+beanName +" "+ beanName.toLowerCase() +") ; \n");
        sb.append("\tList<"+beanName+">  selectById(Long id);\n");
    }

    public void generateJavaMapperEnd(StringBuilder sb){
        sb.append(" \n}\n ");
    }




}
