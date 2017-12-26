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
        gradeMapper.addGrade(grade);
        Integer gradeId=grade.getId();
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
