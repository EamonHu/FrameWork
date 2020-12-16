package cn.eamon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/14 16:56
 */
@RestController
public class TestController {

    @GetMapping("/test/test")
    public String test(String username, HttpServletRequest request) {
        // 认证成功之后放入session
        request.getSession().setAttribute("username", username);
        return "login ok~";
    }
}
