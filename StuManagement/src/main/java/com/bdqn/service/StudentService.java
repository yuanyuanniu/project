package com.bdqn.service;

import com.bdqn.entity.Student;

import java.util.List;

/**
 * Created by sony on 2017/12/11.
 */
public interface StudentService {
    //查看学生信息
    public List<Student> queryAll();
    //添加学员信息
    public Integer addStudent(Student student);

}
