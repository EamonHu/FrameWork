package study.eamon.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import study.eamon.dao.UserDao;
import study.eamon.po.User;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/11/23 23:03
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) {
        // sqlSessionFactory工厂类创建sqlSession会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = null;
        try{
            // sqlSession接口，开发人员使用它对数据库进行增删改查操作
            user = sqlSession.selectOne("test.findUserById", id);

        }finally{
            sqlSession.close();
        }
        return user;
    }

    public List<User> findUserByName(String name) throws Exception {
        // sqlSessionFactory工厂类创建sqlSession会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = null;
        try{
            // sqlSession接口，开发人员使用它对数据库进行增删改查操作
            users = sqlSession.selectList("test.findUsersByName", name);
        }finally{
            sqlSession.close();
        }
        return users;
    }

    public void insertUser(User user) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            sqlSession.insert("test.insertUser", user);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }
}
