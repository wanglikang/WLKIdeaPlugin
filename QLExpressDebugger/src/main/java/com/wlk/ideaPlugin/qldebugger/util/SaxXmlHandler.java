package com.wlk.ideaPlugin.qldebugger.util;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author 奈昕
 * @date 2024/7/9 23:17:05
 */
public class SaxXmlHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws
        SAXException {
        if ("version".equals(qName)) {
            // 处理开始标签，例如version标签开始时的操作
            System.out.println("Found version element");
            // 可以通过attributes获取属性值
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println("Attribute name: " + attributes.getLocalName(i)
                    + ", value: " + attributes.getValue(i));
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String text = new String(ch, start, length).trim();
        if (!text.isEmpty()) {
            // 处理文本内容，例如version元素内的文本
            System.out.println("Version content: " + text);
        }
    }

    // 其他可选的override方法，如endElement等
}