package cn.eamon.mybatis.config;

import org.dom4j.Element;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/8 14:30
 */
public class XMLMapperParser {
    private Configuration configuration;

    public XMLMapperParser(Configuration configuration){
        this.configuration = configuration;
    }

    public void parse(Element rootElement) {
        // mapper标签下回包含一些sql片段标签
        List<Element> elements = rootElement.elements("select");
        for (Element element : elements) {
            // select update delete insert 都对应一个statement
            XMLStatementParser scriptParser = new XMLStatementParser(configuration);
            scriptParser.parseScript(element);
        }
    }
}
