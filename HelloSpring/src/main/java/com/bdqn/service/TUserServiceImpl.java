package com.bdqn.service;

import com.bdqn.dao.TUserDao;
import com.bdqn.PoJo.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sony on 2017/11/25.
 */
@Service("tuserService")
public class TUserServiceImpl implements TUserService {
    //@Autowired
    @Resource
    private TUserDao tUserDao;

    public TUserServiceImpl() {
    }

    public TUserServiceImpl(TUserDao tUserDao){
        this.tUserDao=tUserDao;
    }
    @Override
    public Integer saveTUser(TUser tUser) {
        return tUserDao.saveUser(tUser);
    }
}

