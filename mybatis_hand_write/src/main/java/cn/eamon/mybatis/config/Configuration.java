package cn.eamon.mybatis.config;

import javax.sql.DataSource;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/4 17:34
 */
public class Configuration {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "dataSource=" + dataSource +
                '}';
    }
}
