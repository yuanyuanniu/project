import com.bdqn.entity.TUser;
import com.bdqn.service.TUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by sony on 2017/11/28.
 */
public class TUserMapperTest {
    @Test
    public void quaryAll(){
        ApplicationContext context
                =new ClassPathXmlApplicationContext("applicationContext.xml");
        /*TUserMapper tUserMapper=(TUserMapper)context.getBean("tuserMapper");*/
        TUserService tUserService=(TUserService)context.getBean("tuserService");
        List<TUser>list=tUserService.queryAll();
        if(null!=list){
            for (TUser tUser : list) {
                System.out.println(tUser);
            }
        }
    }
}
