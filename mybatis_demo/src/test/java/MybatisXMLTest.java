import cn.eamon.mybatis.dao.impl.UserDaoImpl;
import cn.eamon.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import sun.security.rsa.RSAUtil;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 9:26
 */
public class MybatisXMLTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testFindUsersByName() throws Exception {
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        List<User> users = userDao.findUsersByName("李");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
