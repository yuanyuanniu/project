package com.bdqn.dao;

import com.bdqn.entity.Grade;

import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
public interface GradeMapper {
    public List<Grade> queryAll();
    public Grade queryGradeById(Integer id);
    public Integer deleteGradeById(Integer id);
    public Integer deleteGradeByIds(List<Integer> list);
    public Integer addGrade(Grade grade);
    Integer updateGrade(Grade grade);

}
