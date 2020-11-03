import com.ccc.aop.Book;
import com.ccc.aop.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 15:09
 */
public class TestAOP {

    @Test
    public void testAopAnno(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        User user=context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void TestBook(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book=context.getBean("book",Book.class);
        book.buy();
    }
}
