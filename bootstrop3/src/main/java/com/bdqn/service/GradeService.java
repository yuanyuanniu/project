package com.bdqn.service;

import com.bdqn.entity.Grade;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
public interface GradeService {
    public PageInfo<Grade> queryAll(Integer pageNum, Integer pageSize);
    public Grade queryGradeById(Integer id);
    public Integer deleteGradeById(Integer id);
    public Integer deleteGradeByIds(List<Integer> list);
    public Integer addGrade(Grade grade);
    Integer updateGrade(Grade grade);
    public List<Grade> queryAll();
}
