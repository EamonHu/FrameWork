package cn.eamon.mybatis.config;

import java.io.InputStream;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/4 17:04
 */
public class Resources {
    /**
     * 加载resource文件
     *
     * getClassLoader()是在根目录上WEB-INF/classes
     * getClass()是在当前类路径下
     * @param resource
     * @return
     */
    public static InputStream getResourceAsStream(String resource) {
        return Resources.class.getClassLoader().getResourceAsStream(resource);
//        return Resources.class.getClass().getResourceAsStream("/"+resource);
    }
}
