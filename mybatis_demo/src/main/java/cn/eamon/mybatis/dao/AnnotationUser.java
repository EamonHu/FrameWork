package cn.eamon.mybatis.dao;

import cn.eamon.mybatis.po.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/15 9:35
 */
public interface AnnotationUser {
    /**
     * 通过用户id查询用户详情
     * @param id 用户id
     * @return 用户详情
     */
    @Select("select * from user where id=#{id}")
    User findUserById(int id);

    /**
     * 名字模糊查询用户列表
     * @param username 模糊用户名
     * @return 用户列表
     */
    @Select("select * from user where username like '%${value}'")
    List<User> findUserList(String username);
}
