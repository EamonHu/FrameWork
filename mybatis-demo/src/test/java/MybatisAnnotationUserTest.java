import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import study.eamon.dao.AnnotationUserMapper;
import study.eamon.po.User;

import java.io.InputStream;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/11/30 11:23
 */
public class MybatisAnnotationUserTest {

    private SqlSessionFactory sqlSessionFactory;
    private InputStream inputStream;

    @Before
    public void init() throws Exception {
        SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = sessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testFindUserById(){
        SqlSession sqlSession= sqlSessionFactory.openSession(true);;
        try{
            AnnotationUserMapper userMapper = sqlSession.getMapper(AnnotationUserMapper.class);
            User user = userMapper.findUserById(1);
            System.out.println(user);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);   // 设置true为自动提交
        AnnotationUserMapper userMapper = sqlSession.getMapper(AnnotationUserMapper.class);
        User user = new User();
        user.setUsername("Eamon_Bupt");
        user.setSex("1");
        user.setAddress("China");
        userMapper.insertUser(user);
        System.out.println(user.getId());
        sqlSession.close();
    }
}
