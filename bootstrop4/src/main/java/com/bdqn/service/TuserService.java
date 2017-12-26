package com.bdqn.service;

import com.bdqn.entity.Tuser;
import com.github.pagehelper.PageInfo;

/**
 * Created by sony on 2017/12/9.
 */
public interface TuserService {
    public Tuser login(Tuser tuser);
    public PageInfo<Tuser> queryAll(Integer pageNum, Integer pageSize);
}
