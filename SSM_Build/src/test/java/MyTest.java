import com.ccc.pojo.Books;
import com.ccc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/11/3 16:17
 */
public class MyTest {
    @Test
    public void myTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService= (BookService) context.getBean("bookServiceImpl");
        for (Books books: bookService.queryBook()) {
            System.out.println(books);

        }
    }
}
