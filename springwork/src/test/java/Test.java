import com.ioc.service.UserService;
import com.ioc.service.impl.UserServiceImpl1;
import com.ioc.service.impl.UserServiceImpl2;
import com.ioc.service.impl.UserServiceImpl3;
import com.ioc.service.impl.UserServiceImpl4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ApplicationContext appContext= new  ClassPathXmlApplicationContext("spring-config.xml");
//        UserService userService= appContext.getBean(UserServiceImpl1.class);
        UserService userServiceImpl1=appContext.getBean(UserServiceImpl1.class);
        UserService userServiceImpl2=appContext.getBean(UserServiceImpl2.class);
        UserService userServiceImpl3=appContext.getBean(UserServiceImpl3.class);
        UserService userServiceImpl4=appContext.getBean(UserServiceImpl4.class);
        System.out.println(userServiceImpl1.sum(1, 10));
        System.out.println(userServiceImpl2.sum(1, 10));
        System.out.println(userServiceImpl3.sum(1, 10));
        System.out.println(userServiceImpl4.sum(1, 10));
    }
}
