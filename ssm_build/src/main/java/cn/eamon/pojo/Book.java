package cn.eamon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/1/6 14:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer bookId;
    private String bookName;
    private int bookCounts;
    private String detail;
}
