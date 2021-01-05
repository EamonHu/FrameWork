package cn.eamon.service.impl;

import cn.eamon.dao.UserDao;
import cn.eamon.dao.impl.UserDaoImpl;
import cn.eamon.service.UserService;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 10:44
 */
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");

    }

    public void update() {
        System.out.println("更新了一个用户");

    }

    public void select() {
        System.out.println("查询了一个用户");

    }
}
