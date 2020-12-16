import cn.eamon.mybatis.dao.AnnotationUser;
import cn.eamon.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 10:39
 */
public class MybatisAnnotationTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testFindUserById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationUser mapper = sqlSession.getMapper(AnnotationUser.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUserList(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationUser mapper = sqlSession.getMapper(AnnotationUser.class);
        List<User> userList = mapper.findUserList("李");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
