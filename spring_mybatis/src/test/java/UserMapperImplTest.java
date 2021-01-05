import cn.eamon.mapper.UserMapper;
import cn.eamon.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 17:41
 */
public class UserMapperImplTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.selectAllUser()) {
            System.out.println(user);
        }
    }
}
