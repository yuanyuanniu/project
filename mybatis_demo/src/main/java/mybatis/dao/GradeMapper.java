package mybatis.dao;

import mybatis.entity.Grade;

/**
 * Created by Administrator on 2017/11/21/021.
 */
public interface GradeMapper {
    public Grade queryGradeById(Integer gradeId);
}
