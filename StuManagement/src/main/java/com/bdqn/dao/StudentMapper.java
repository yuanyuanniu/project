package com.bdqn.dao;

import com.bdqn.entity.Student;

import java.util.List;

/**
 * Created by sony on 2017/12/11.
 */
public interface StudentMapper {
    public List<Student> queryAll();
    public Integer addStudent(Student student);
}
