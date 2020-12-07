package cn.eamon.mybatis.config;

import cn.eamon.mybatis.core.Constant;
import org.apache.commons.dbcp.BasicDataSource;
import org.dom4j.Element;

import java.util.List;
import java.util.Properties;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/4 17:35
 */
public class XMLConfigParser {

    private Configuration configuration;

    public XMLConfigParser() {
        this.configuration = new Configuration();
    }

    public Configuration parse(Element rootElement) {
        parseEnvironments(rootElement.element("environments"));
        parseMappers(rootElement.element("mappers"));
        return configuration;
    }

    private void parseMappers(Element mappers) {
    }

    private void parseEnvironments(Element element) {
        String defaultEnvId = element.attributeValue("default");
        if (defaultEnvId == null || "".equals(defaultEnvId)) {
            return;
        }
        List<Element> elements = element.elements("environment");
        for (Element envElement : elements) {
            String envId = envElement.attributeValue("id");
            if (defaultEnvId.equals(envId)) {
                parseEnvironment(envElement);
            }
        }
    }

    private void parseEnvironment(Element envElement) {
        Element dataSourceEnv = envElement.element("dataSource");

        String type = dataSourceEnv.attributeValue("type");
        type = type == null || type.equals("") ? Constant.DBCP : type;
        if(Constant.DBCP.equals(type)){
            Properties properties = parseProperty(dataSourceEnv);

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName(properties.getProperty("driver"));
            dataSource.setUrl(properties.getProperty("url"));
            dataSource.setUsername(properties.getProperty("username"));
            dataSource.setPassword(properties.getProperty("password"));
            configuration.setDataSource(dataSource);
        }
    }

    private Properties parseProperty(Element dataSource) {
        Properties properties = new Properties();
        List<Element> elements = dataSource.elements("property");
        for (Element element : elements) {
            String name = element.attributeValue("name");
            String value = element.attributeValue("value");
            properties.put(name, value);
        }
        return properties;
    }
}
