package cn.eamon.mybatis.dao.impl;

import cn.eamon.mybatis.dao.UserDao;
import cn.eamon.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 9:17
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    // 注入SqlSessionFactory
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = null;
        try{
            user = sqlSession.selectOne("cn.eamon.mybatis.dao.UserDao.findUserById", id);
            System.out.println(user);
        }finally {
            sqlSession.close();
        }
        return user;
    }

    public List<User> findUsersByName(String name) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = null;
        try{
            users = sqlSession.selectList("cn.eamon.mybatis.dao.UserDao.findUsersByName", name);
            System.out.println(users);
        }finally {
            sqlSession.close();
        }
        return users;
    }
}
