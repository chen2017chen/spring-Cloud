import com.ccc.pojo.Books;
import com.ccc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/28 1:54
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService= (BookService) context.getBean("BookServiceImpl");
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
