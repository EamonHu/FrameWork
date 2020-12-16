package cn.eamon.service;

import cn.eamon.entity.User;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/16 15:33
 */
public interface UserService {
    /**
     * 用户登录
     * @param user 提供用户名和密码
     * @return 用户详细信息
     */
    User login(User user);
}
