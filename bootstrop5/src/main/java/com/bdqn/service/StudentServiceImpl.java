package com.bdqn.service;

import com.bdqn.dao.StudentMapper;
import com.bdqn.dao.StudentNumMapper;
import com.bdqn.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/12/13.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private StudentNumMapper studentNumMapper;
    @Override
    public PageInfo<Student> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Student> list=studentMapper.queryAll();
        PageInfo<Student> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer deleteStudentByIds(List<Integer> list) {
        return studentMapper.deleteStudentByIds(list);
    }

    @Override
    public Integer addStudent(Student student) {
        //添加学生的时候自动生成学生编号
        //先在studnet_num表中把最大学生编号加一
        Integer gradeId=student.getGrade().getId();
        studentNumMapper.updateMaxNumByGradeId(gradeId);
        //再把max_num取出
        Integer maxNum=studentNumMapper.queryMaxNumByGradeId(gradeId);
        //串成学号在前台页面输出//组成是班级名+max_num不够中间补零要求十五位
        //先获取班级名gradeName
        String gradeName=student.getGrade().getGradeName();
        //学生编号为
        String studentNum=gradeName+maxNum;
        int n=15-(studentNum.length());
        if(n>0){
            for (int i=0;i<n;i++){
                gradeName+=0;
            }
        }
        studentNum=gradeName+maxNum;
        student.setStudentNum(studentNum);
        return studentMapper.addStudent(student);

    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.queryStudentById(id);

    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }
}
