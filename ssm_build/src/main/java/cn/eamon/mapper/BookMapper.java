package cn.eamon.mapper;

import cn.eamon.pojo.Book;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/1/6 15:26
 */
public interface BookMapper {

    /**
     * 增加一本书
     */
    int addBook(Book book);

    /**
     * 删除一本书
     */
    int deleteBook(int id);

    /**
     * 更新一本书
     */
    int updateBook(Book book);

    /**
     * 根据ID查询一本书
     */
    Book queryBookById(int id);

    /**
     * 查询所有书，返回List集合
     */
    List<Book> queryAllBooks();
}
