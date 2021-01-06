package cn.eamon.service.impl;

import cn.eamon.mapper.BookMapper;
import cn.eamon.pojo.Book;
import cn.eamon.service.BookService;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/1/6 15:56
 */
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Book> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
