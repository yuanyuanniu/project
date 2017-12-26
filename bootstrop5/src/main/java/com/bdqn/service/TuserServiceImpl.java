package com.bdqn.service;

import com.bdqn.dao.TuserMapper;
import com.bdqn.entity.Tuser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
@Service("tuserService")
public class TuserServiceImpl implements TuserService {
    @Resource
    private TuserMapper tuserMapper;

    @Override
    public Tuser login(Tuser tuser) {

        return tuserMapper.login(tuser);
    }

    @Override
    public PageInfo<Tuser> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Tuser>list=tuserMapper.queryAll();
        PageInfo<Tuser> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}
