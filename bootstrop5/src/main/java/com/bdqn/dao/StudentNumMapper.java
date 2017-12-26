package com.bdqn.dao;

/**
 * Created by sony on 2017/12/17.
 */
public interface StudentNumMapper {
    //同步一条新增的班级记录
    public Integer addStudentNum(Integer gradeId);
    //新增一名学生就要修改学生编号让最大编号加一
    Integer updateMaxNumByGradeId(Integer gradeId);
    //修改完成之后要取到该最大编号进行记录（查看）
    Integer queryMaxNumByGradeId(Integer id);

}
