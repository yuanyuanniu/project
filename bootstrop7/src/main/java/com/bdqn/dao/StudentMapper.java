package com.bdqn.dao;

import com.bdqn.entity.Student;

import java.util.List;

/**
 * Created by sony on 2017/12/13.
 */
public interface StudentMapper {
    public List<Student> queryAll();
    public Integer deleteStudentByIds(List<Integer> list);
}
