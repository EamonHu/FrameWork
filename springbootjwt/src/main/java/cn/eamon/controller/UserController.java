package cn.eamon.controller;

import cn.eamon.entity.User;
import cn.eamon.service.UserService;
import cn.eamon.utils.JWTUtils;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/16 15:37
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    public Map<String,Object> login(User user){
        log.info("用户名：[{}]", user.getName());
        log.info("密码：[{}]", user.getPassword());
        Map<String, Object> result = new HashMap<>();
        try {
            User userDb = userService.login(user);
            //用来存放payload
            Map<String, String> payLoad = new HashMap<>();
            payLoad.put("id",userDb.getId());
            payLoad.put("username", userDb.getName());
            String token = JWTUtils.getToken(payLoad);
            result.put("state",true);
            result.put("msg","登录成功!!!");
            //成功返回token信息
            result.put("token",token);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("state","false");
            result.put("msg",e.getMessage());
        }
        return result;
    }

    @PostMapping("/test/user")
    public Map<String,Object> test(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        //处理自己业务逻辑
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        log.info("用户id: [{}]",verify.getClaim("id").asString());
        log.info("用户name: [{}]",verify.getClaim("name").asString());
        map.put("state",true);
        map.put("msg","请求成功!");
        return map;
    }
}

