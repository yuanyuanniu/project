package com.bdqn.service;

import com.bdqn.dao.StudentMapper;
import com.bdqn.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/12/11.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> queryAll() {
        return studentMapper.queryAll();
    }

    @Override
    public Integer addStudent(Student student) {

        return studentMapper.addStudent(student);
    }
}
