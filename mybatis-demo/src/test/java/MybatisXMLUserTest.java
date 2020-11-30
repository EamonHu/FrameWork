import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import study.eamon.dao.UserDao;
import study.eamon.dao.impl.UserDaoImpl;
import study.eamon.po.User;
import com.alibaba.fastjson.JSON;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/11/24 16:22
 */
public class MybatisXMLUserTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception {
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        List<User> users = userDao.findUserByName("老李");
        System.out.println(JSON.toJSONString(users));
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setAddress("海南");
        user.setSex("女");
        user.setUsername("小李");
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        userDao.insertUser(user);
        System.out.println("ok");
    }
}
