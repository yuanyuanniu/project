package com.bdqn.service;

import com.bdqn.entity.Student;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by sony on 2017/12/13.
 */
public interface StudentService {
    public PageInfo<Student> queryAll(Integer pageNum, Integer pageSize);
    public Integer deleteStudentByIds(List<Integer> list);
}
