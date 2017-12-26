import com.bdqn.entity.Grade;
import com.bdqn.service.GradeService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class GradeServiceTest {
    @Test
    public void updateGrade() throws Exception {
        Grade grade=new Grade();
        grade.setId(12);
        grade.setDetails("尽量快点放假看");
        int n=gradeService.updateGrade(grade);
        System.out.println(n);
    }

    @Resource
    private GradeService gradeService;
    @Test
    public void addGrade() throws Exception {
        Grade grade=new Grade();
        grade.setGradeName("tcmp90");
        grade.setDetails("tcmp90的描述");
        int n = gradeService.addGrade(grade);
        System.out.println(n);
        System.out.println(grade.getId());
    }


    @Test
    public void queryAll() throws Exception {
        PageInfo<Grade> pageInfo=gradeService.queryAll(2,3);
        if (pageInfo != null) {
            List<Grade> list=pageInfo.getList();
            if (list != null) {
                for (Grade grade : list) {
                    System.out.println(grade);
                }
            }
            System.out.println("总计录数" + pageInfo.getTotal());
            System.out.println("总页数" + pageInfo.getPages());
        }
    }
    @Test
    public void queryAll1()throws Exception{
        List<Grade> gradeList=gradeService.queryAll();
        if(null!=gradeList){
            for(Grade grade:gradeList){
                System.out.println(grade);
            }
        }
    }


}