package cn.eamon.test;

import cn.eamon.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 10:48
 */
public class UserServiceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }
}
