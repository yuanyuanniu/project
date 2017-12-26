package com.bdqn.service;

import com.bdqn.dao.TUserMapper;
import com.bdqn.entity.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/11/28.
 */
@Service("tuserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserMapper tUserMapper;
    @Override
    public List<TUser> queryAll() {
        return tUserMapper.queryAll();
    }
}
