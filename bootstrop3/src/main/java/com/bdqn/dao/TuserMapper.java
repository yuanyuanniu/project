package com.bdqn.dao;

import com.bdqn.entity.Tuser;

import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
public interface TuserMapper {
    public Tuser login(Tuser tuser);
    public List<Tuser> queryAll();
}
