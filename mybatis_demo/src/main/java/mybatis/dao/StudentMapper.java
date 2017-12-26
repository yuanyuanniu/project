package mybatis.dao;

import mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/21/021.
 */
public interface StudentMapper {
    public List<Student> queryStudent();
    List<Student> queryStudentByGradeId_array(Integer[] gradeid);
    List<Student> queryStudentByGradeId_list(List<Integer> gradeid);
    List<Student> queryStudentByGradeId_map(Map<String,Object> map);
    List<Student> queryStudent_choose(@Param("name")String name,@Param("gender")String gender,@Param("age")Integer age);
}
