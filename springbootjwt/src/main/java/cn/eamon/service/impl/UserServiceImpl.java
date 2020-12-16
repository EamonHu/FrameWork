package cn.eamon.service.impl;

import cn.eamon.dao.UserDao;
import cn.eamon.entity.User;
import cn.eamon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/16 15:33
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        User userDb = userDao.login(user);
        if(userDb!=null){
            return userDb;
        }
        throw new RuntimeException("登录失败~");
    }
}
