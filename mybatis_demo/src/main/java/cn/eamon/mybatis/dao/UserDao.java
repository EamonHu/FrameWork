package cn.eamon.mybatis.dao;

import cn.eamon.mybatis.po.User;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/14 16:02
 */
public interface UserDao {
    /**
     * 通过用户ID查询用户信息
     * @param id 用户ID
     * @return 用户信息
     * @throws Exception 执行SQL异常
     */
    User findUserById(int id) throws Exception;

    /**
     * 通过用户名模糊查询你用户信息列表
     * @param name  用户名
     * @return 用户信息列表
     * @throws Exception 执行SQL异常
     */
    List<User> findUsersByName(String name) throws Exception;
}
