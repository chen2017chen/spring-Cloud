import com.ccc.pojo.Book;
import com.ccc.servcie.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 16:58
 */
public class JDBCTest {

    @Test
    public void JDBCTemplateTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService=context.getBean("bookService", BookService.class);
        Book book=new Book();
        book.setId(1);
        book.setUsername("java");
        book.setUstatus("a");
        bookService.addBook(book);
    }
}
