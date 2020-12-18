package cn.eamon.mybatis.config;

import org.dom4j.Element;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/8 14:34
 */
public class XMLStatementParser {
    private Configuration configuration;

    public XMLStatementParser(Configuration configuration){
        this.configuration  = configuration;
    }

    public void parseScript(Element element) {
    }
}
