package com.wlk.ideaPlugin.do2sqlmapper.task;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import com.wlk.ideaPlugin.do2sqlmapper.BeanGenerateContext;
import com.wlk.ideaPlugin.do2sqlmapper.util.Utils;

/**
 * @author 奈昕
 * @date 2020/7/6
 */
public class XMLGenerateTask implements  Runnable{
    private BeanGenerateContext context;
    private String filePath ;
    private File fileXML;
    public XMLGenerateTask(BeanGenerateContext context,String generateFilePath){
        this.context = context;
        this.filePath = generateFilePath;
        fileXML = new File(this.filePath);
        if(!fileXML.getParentFile().exists()){
            try {
                fileXML.getParentFile().createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        generateXMLMapper(sb);
        Writer brxml = null;
        try {
            brxml = new FileWriter(fileXML);
            brxml.write(sb.toString());
            brxml.flush();
            brxml.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 生成对应的mapper xml文件，对应文件名为：
     * BeanNameMapper.xml
     */
    public void generateXMLMapper(StringBuilder sb){
        generateXMLMapperHeader(sb);
        generateXMLMapperBaseSQL(sb);

        generateQuery(sb);
        generateInsert(sb);
        generateInsertSelective(sb);
        generateUpdate(sb);
        generateDelete(sb);

        generateXMLMapperEnd(sb);
    }

    public void generateXMLMapperHeader(StringBuilder sb){
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n" +
                "<mapper namespace=\""+context.getPackageName()+"."+context.getBeanName()+"\">\n");
        sb.append("\n");


    }
    public void generateXMLMapperBaseSQL(StringBuilder sb){
       generateBaseResultMap(sb);
       generateBaseColumnList(sb);
        generateSelectConditions(sb);
    }


    public void generateBaseResultMap(StringBuilder sb){

        //生成resultMap 节点 ------start-----
        sb.append("\t<resultMap id=\"BaseResultMap\" type=\""+context.getPackageName()+"."+context.getBeanName()+"\"> \n");
        for (String idField : context.getIdFields()) {
            //TODO 转换成mysql的类型
            sb.append("\t\t<id column=\""+ Utils.fieldName2DBColName(idField)+"\" " +
                    "property=\""+ (idField)+"\" " +
                    "jdbcType=\""+Utils.fieldType2DBType(context.getField2Type().get(idField))+"\" />\n");
        }
        context.getField2Type().entrySet().forEach(v->{
            String fname = v.getKey();
            if(!context.getIdFields().contains(fname)){
                sb.append("\t\t<result column=\""+Utils.fieldName2DBColName(fname)+"\" " +
                        "property=\""+(fname)+"\" " +
                        "jdbcType=\""+Utils.fieldType2DBType(context.getField2Type().get(fname))+"\" />\n");
            }
        });
        sb.append("\t</resultMap>\n");
        sb.append("\n");
        //生成resultMap 节点 ------end-----
    }

    public void generateBaseColumnList(StringBuilder sb){
        //生成Base_Column_List 节点 ------start-----
        sb.append("\t<sql id=\"Base_Column_List\">\n");
        sb.append("\t\t");
        context.getField2Type().entrySet().forEach(v -> {
            sb.append(Utils.fieldName2DBColName(v.getKey()) + ",");
        });
        sb.setCharAt(sb.length() - 1, '\n');
        sb.append("\t</sql>\n");
        sb.append("\n");
        //生成Base_Column_List 节点 ------end-----
    }

    public void generateSelectConditions(StringBuilder sb){
        //生成SelectConditions 节点 ------start-----
        sb.append("\t<sql id=\"SelectConditions\">\n");
        sb.append("\t\t");
        sb.append("\t\t 1 = 1 \n");
        context.getField2Type().entrySet().forEach(v -> {
            sb.append("\t\t<if test=\""+v.getKey()+" != null\">\n");
            sb.append("\t\t\tand "+Utils.fieldName2DBColName(v.getKey())+" = #{"+v.getKey()+"}\n");
            sb.append("\t\t</if>\n");
        });
        sb.append("\t\tand env = #{env}\n");
        sb.append("\t</sql>\n");
        sb.append("\n");
        //生成SelectConditions 节点 ------end-----
    }

    public void generateQuery(StringBuilder sb){

        sb.append("\t<select id=\"query\" resultMap=\"BaseResultMap\" parameterType=\"java.util.Map\" > \n");
        sb.append(
        "\t\tselect\n" +
        "\t\t<include refid=\"Base_Column_List\" />\n" +
        "\t\tfrom "+context.getTableName()+" \n" +
        "\t\twhere <include refid=\"SelectConditions\"/>\n" +
        "\t\t\torder by id desc\n" +
        "\t\t<if test=\"start!=null\">\n" +
        "\t\t\t<if test=\"limit!=null\">\n" +
        "\t\t\t\tlimit #{start},#{limit}\n" +
        "\t\t\t</if>\n" +
        "\t\t</if>\n"+
        "\t</select> \n");

        sb.append(
                "\t<select id=\"selectByPrimaryKey\" resultMap=\"BaseResultMap\" parameterType=\"java.lang.Long\" >\n" +
                "\t\tselect\n" +
                "\t\t<include refid=\"Base_Column_List\" />\n" +
                "\t\tfrom "+context.getTableName()+" \n" +
                "\t\twhere id = #{id,jdbcType=BIGINT} \n" +
                "\t\t</select>\n");
        sb.append("\n");
    }

    public void generateInsert(StringBuilder sb){
        sb.append(
        "\t<insert id=\"insert\" parameterType=\""+context.getPackageName()+"."+context.getBeanName()+"\" keyProperty=\"id\" useGeneratedKeys=\"true\">\n" +
        "\t\tinsert into "+context.getTableName()+" (gmt_create, gmt_modified,\n");
        int count = 1;
        sb.append("\t\t\t");
        for (Map.Entry<String, String> stringStringEntry : context.getField2Type().entrySet()) {
            if(!stringStringEntry.getKey().startsWith("gmt_")){
                count++;
                if(count%5==0) {
                    sb.append("\n\t\t\t");
                }
                sb.append(Utils.fieldName2DBColName(stringStringEntry.getKey())+",");
            }
        }
        sb.delete(sb.length()-1,sb.length());
        sb.append(
        "      )\n" +
        "\t\tvalues (now(),now(),\n" );
        count=1;
        sb.append("\t\t\t");
        for (Map.Entry<String, String> v : context.getField2Type().entrySet()) {
            if(!v.getKey().startsWith("gmt_")){
                count++;
                if(count%5==0) {
                    sb.append("\n\t\t\t");
                }
                sb.append("#{"+v.getKey()+" , jdbcType="+Utils.fieldType2DBType(v.getValue())+" } ,");
            }
        }
        sb.delete(sb.length()-1,sb.length());
        sb.append("  ) \n");
        sb.append("\t</insert> \n");
        sb.append("\n");

    }
    public void generateInsertSelective(StringBuilder sb){
        sb.append(
                "\t<insert id=\"insertSelective\" parameterType=\""+context.getPackageName()+"."+context.getBeanName()+"\" keyProperty=\"id\" useGeneratedKeys=\"true\">\n" +
                        "\t\tinsert into "+context.getTableName()+"\n");
        int count = 1;
        sb.append("\t\t<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >\n");
        for (Map.Entry<String, String> stringStringEntry : context.getField2Type().entrySet()) {
            if(!stringStringEntry.getKey().startsWith("gmt")){
                count++;
                sb.append("\t\t\t<if test=\""+stringStringEntry.getKey()+" != null\">\n");
                sb.append("\t\t\t\t"+Utils.fieldName2DBColName(stringStringEntry.getKey())+" ,\n");
                sb.append("\t\t\t</if>\n");
            }
        }
        sb.append("\t\t</trim>\n");

        sb.append("\t\t<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >\n");
        for (Map.Entry<String, String> stringStringEntry : context.getField2Type().entrySet()) {
            if(!stringStringEntry.getKey().startsWith("gmt")){
                count++;
                sb.append("\t\t\t<if test=\""+stringStringEntry.getKey()+" != null\">\n");
                sb.append("\t\t\t\t #{"+stringStringEntry.getKey()+"} ,\n");
                sb.append("\t\t\t</if>\n");
            }
        }
        sb.append("\t\t</trim>\n");

//        sb.delete(sb.length()-1,sb.length());
        sb.append("\t</insert> \n");
        sb.append("\n");
    }



    public void generateDelete(StringBuilder sb){
        sb.append(
                "\t<delete id=\"deleteByPrimaryKey\" parameterType=\"java.lang.Long\" >\n" +
                "\t\tdelete from "+context.getTableName()+"\n" +
                "\t\t\twhere id = #{id,jdbcType=BIGINT}\n" +
                "\t</delete> \n");
        sb.append("\n");
    }

    public void generateUpdate(StringBuilder sb){
        sb.append(
                "\t<update id=\"updateByPrimaryKeySelective\" parameterType=\""+context.getPackageName()+"."+context.getBeanName()+"\" >\n" +
                "\t\tupdate "+context.getTableName()+"\n" +
                "\t\t\t<set >\n");
        context.getField2Type().entrySet().forEach(v->{
            sb.append(
                    "\t\t\t\t<if test=\""+v.getKey()+" != null\" >\n" +
                    "\t\t\t\t\t"+Utils.fieldName2DBColName(v.getKey())+" = #{"+v.getKey()+",jdbcType="+Utils.fieldType2DBType(v.getValue())+"},\n" +
                    "\t\t\t\t</if>\n");
        });
        sb.append("\t\t</set>\n");
        sb.append("\t\twhere id =  #{id,jdbcType=BIGINT} \n");
        sb.append("\t</update> \n");
        sb.append("\n");
    }

    public void generateXMLMapperEnd(StringBuilder sb){
        sb.append("\n");
        sb.append("</mapper>");
        sb.append("\n");
    }

}
