package cn.eamon.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/31 16:43
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Date birthday;
}
