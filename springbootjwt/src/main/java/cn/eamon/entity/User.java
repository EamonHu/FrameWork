package cn.eamon.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/16 15:20
 */
@Data
@Accessors(chain = true)
public class User {

    private String id;

    private String name;

    private String password;
}
