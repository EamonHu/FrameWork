package cn.eamon.config;


import cn.eamon.interceptors.JWTInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 /**
   * @Author: Eamon
   * @Description:
   * @Date: 2020/12/16 17:38
   */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                .addPathPatterns("/*")
                .excludePathPatterns("/user/*");
    }
}
