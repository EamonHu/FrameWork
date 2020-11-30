package study.eamon.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import study.eamon.po.User;

/**
 * @Author: Eamon
 * @Description: 注解实现操作user
 * @Date: 2020/11/30 11:04
 */
public interface AnnotationUserMapper {

    /**
     * 通过用户ID查询用户信息
     * @param id 用户ID
     * @return User对象
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findUserById(int id);

    /**
     *  插入用户返回插入主键ID
     * @param user 插入用户pojo
     */
    @Insert("INSERT INTO user(username, birthday, sex, address) VALUES (#{username},#{birthday},#{sex},#{address})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", resultType = int.class, before = false)
    void insertUser(User user);
}
