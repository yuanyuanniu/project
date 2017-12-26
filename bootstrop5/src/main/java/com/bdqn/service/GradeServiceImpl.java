package com.bdqn.service;

import com.bdqn.dao.GradeMapper;
import com.bdqn.dao.StudentNumMapper;
import com.bdqn.entity.Grade;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeMapper gradeMapper;
@Resource
private StudentNumMapper studentNumMapper;
    @Override
    public PageInfo<Grade> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Grade> list=gradeMapper.queryAll();
        PageInfo<Grade> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Grade queryGradeById(Integer id) {
        return gradeMapper.queryGradeById(id);
    }

    @Override
    public Integer deleteGradeById(Integer id) {
        return gradeMapper.deleteGradeById(id);
    }

    @Override
    public Integer deleteGradeByIds(List<Integer> list) {
        return gradeMapper.deleteGradeByIds(list);
    }

    @Override
    public Integer addGrade(Grade grade) {
         gradeMapper.addGrade(grade);//添加了一个班通过keyproperty属性刷新
        //取班级表的id属性
        Integer gradeId=grade.getId();
        //取到gradeId的值以后再student_num中同步一条班级以及目前班级里最大人数
        return studentNumMapper.addStudentNum(gradeId);


    }

    @Override
    public Integer updateGrade(Grade grade) {
        return gradeMapper.updateGrade(grade);
    }

    @Override
    public List<Grade> queryAll() {
        return gradeMapper.queryAll();
    }
}
