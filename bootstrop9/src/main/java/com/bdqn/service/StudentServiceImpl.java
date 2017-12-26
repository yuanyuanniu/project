package com.bdqn.service;

import com.bdqn.dao.StudentMapper;
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
}
