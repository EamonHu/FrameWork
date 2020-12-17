package cn.eamon.dao;

import cn.eamon.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: Eamon
 * @Description: 用户类Dao接口
 * @Date: 2020/12/16 15:28
 *
 * mapper一定要有，否则Mybatis找不到mapper
 * Repository为了消除依赖注入的报错信息。同Component
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 登录接口
     * @param user 用户名和密码
     * @return 用户详细信息
     */
    User login(User user);
}
