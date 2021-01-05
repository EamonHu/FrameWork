package cn.eamon.mapper;

import cn.eamon.pojo.User;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 16:56
 */
public interface UserMapper {

    List<User> selectAllUser();
}
