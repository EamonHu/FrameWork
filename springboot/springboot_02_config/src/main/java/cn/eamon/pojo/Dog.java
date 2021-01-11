package cn.eamon.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/1/11 16:22
 */
@Data
@Component
public class Dog {

    @Value("阿黄")
    private String name;
    @Value("3")
    private Integer age;
}
