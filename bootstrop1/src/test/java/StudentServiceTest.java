import com.bdqn.entity.Grade;
import com.bdqn.entity.Student;
import com.bdqn.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony on 2017/12/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class StudentServiceTest {
    @Test
    public void queryStudentById() throws Exception {
        Student student= studentService.queryStudentById(3);
        if (null!=student) {
            System.out.println(student);
        }
    }

    @Test
    public void addStudent() throws Exception {
        Student student=new Student();
        student.setAge(12);
        student.setGender("女");
        student.setStudentName("韩梅梅");
        Grade grade=new Grade();
        grade.setId(43);
        grade.setGradeName("tcmp90");
        student.setGrade(grade);
        //student.setStudentNum("jlkdjflk");
        int n=studentService.addStudent(student);
        System.out.println(n);
    }

    @Test
    public void deleteStudentByIds() throws Exception {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        int n=studentService.deleteStudentByIds(list);
        System.out.println(n);
    }

    @Resource
    private StudentService studentService;
    @Test
    public void queryAll() throws Exception {
        PageInfo<Student>pageInfo=studentService.queryAll(2,3);
        if(null!=pageInfo){
            System.out.println(pageInfo);
            List<Student> list=pageInfo.getList();
            if (list != null) {
                for (Student student : list) {
                    System.out.println(student);
                }
            }
        }
    }

}