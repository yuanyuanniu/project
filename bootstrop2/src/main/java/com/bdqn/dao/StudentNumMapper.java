package com.bdqn.dao;

/**
 * Created by sony on 2017/12/18.
 */
public interface StudentNumMapper {
public Integer addStudentNum(Integer gradeId);
public Integer updateMaxNum(Integer gradeId);
public Integer queryMaxNum(Integer gradeId);

}
