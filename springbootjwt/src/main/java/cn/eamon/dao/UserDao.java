package cn.eamon.dao;

import cn.eamon.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/16 15:28
 */
@Repository
public interface UserDao {
    /**
     * 登录接口
     * @param user 用户名和密码
     * @return 用户详细信息
     */
    User login(User user);
}
