import com.bdqn.dao.TUserDao;
import com.bdqn.dao.TUserDaoImpl;
import com.bdqn.PoJo.TUser;
import com.bdqn.service.TUserService;
import com.bdqn.service.TUserServiceImpl;
import org.junit.Test;

/**
 * Created by sony on 2017/11/25.
 */
public class TUserServiceTest {
    @Test
    public void saveTUser() throws Exception {
        //TUserService tUserService=new TUserServiceImpl();
        //tUserService.saveTUser(new TUser());
       /* ApplicationContext context
               =new ClassPathXmlApplicationContext("applicationContext.xml");
        TUserService tUserService=(TUserService)context.getBean("tuserService");

       tUserService.saveTUser(new TUser());*/
       TUser tUser=new TUser();
       TUserDao tUserDao=new TUserDaoImpl();
       TUserService tUserService=new TUserServiceImpl(tUserDao);
       tUserService.saveTUser(tUser);
    }
}
