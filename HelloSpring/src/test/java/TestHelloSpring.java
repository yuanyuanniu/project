import com.bdqn.PoJo.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sony on 2017/11/25.
 */
public class TestHelloSpring {
    @Test
    public void TestHelloSpring(){
        //先创建一个context对象
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据id来取Bean的实例
        //注意要强转
        //通过这个context这个对象调取applicationContext.xml中的bean中id等于helloSpring的对像
        HelloSpring helloSpring=(HelloSpring)context.getBean("helloSpring");
        helloSpring.print();
    }
}
