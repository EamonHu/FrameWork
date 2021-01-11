package cn.eamon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/1/8 16:13
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/springboot")
    public String hello() {
        return "hello springboot";
    }
}
