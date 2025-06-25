import com.xs.config.SpringConfig;
import com.xs.service.IUserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);

        IUserService userService = ioc.getBean(IUserService.class);
        userService.getUser();
    }

}
