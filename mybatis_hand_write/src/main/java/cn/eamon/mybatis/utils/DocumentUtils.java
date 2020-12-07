package cn.eamon.mybatis.utils;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/4 17:22
 */
public class DocumentUtils {
    public static Document readDocument(InputStream inputStream) {
        Document document = null;
        try{
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
        return document;

    }
}
