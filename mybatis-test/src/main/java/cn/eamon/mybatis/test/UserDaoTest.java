package cn.eamon.mybatis.test;

import cn.eamon.mybatis.config.Configuration;
import cn.eamon.mybatis.config.Resources;
import cn.eamon.mybatis.config.XMLConfigParser;
import cn.eamon.mybatis.utils.DocumentUtils;
import org.dom4j.Document;
import org.junit.Test;

import java.io.InputStream;


/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/4 16:39
 */
public class UserDaoTest {
    @Test
    public void testInitConfiguration(){
        // 指定全局配置文件
        String resource = "SqlMapConfig.xml";
        // 获取指定路径的IO流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 获取Document对象
        Document document = DocumentUtils.readDocument(inputStream);
        // 解析Document获取Configuration对象
        XMLConfigParser configParser = new  XMLConfigParser();
        Configuration configuration = configParser.parse(document.getRootElement());
        System.out.println(configuration);
    }
}
