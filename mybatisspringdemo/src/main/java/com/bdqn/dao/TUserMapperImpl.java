package com.bdqn.dao;

import com.bdqn.entity.TUser;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Created by sony on 2017/11/28.
 */
public class TUserMapperImpl implements TUserMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<TUser> queryAll() {

        return sqlSessionTemplate.selectList("com.bdqn.dao.TUser.queryAll");
    }
}
