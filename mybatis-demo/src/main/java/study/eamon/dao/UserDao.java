package study.eamon.dao;

import study.eamon.po.User;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/11/23 21:22
 */
public interface UserDao {
    User findUserById(int id) throws Exception;

    List<User> findUserByName(String name) throws  Exception;

    void insertUser(User user) throws Exception;
}
