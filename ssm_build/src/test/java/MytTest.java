import cn.eamon.pojo.Book;
import cn.eamon.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2021/1/6 16:47
 */
public class MytTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for (Book book : bookServiceImpl.queryAllBooks()) {
            System.out.println(book);
        }
    }
}
