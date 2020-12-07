package cn.eamon.mybatis.dao;

import cn.eamon.mybatis.po.User;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/4 16:40
 */
public interface UserDao {
    /**
     * 根据用户Id查询用户信息
     * @param param
     * @return
     */
    User queryUserById(User param);
    /**
     * 根据用户Id查询用户信息
     * @param param
     * @return
     */
    User queryUserById2(User param);
}
