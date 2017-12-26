package com.bdqn.dao;

import com.bdqn.PoJo.TUser;
import org.springframework.stereotype.Repository;

/**
 * Created by sony on 2017/11/25.
 */
@Repository("tuserDao")
public class TUserDaoImpl implements TUserDao {
    @Override
    public Integer saveUser(TUser tUser) {
        System.out.println("保存TUser");

        return 1;
    }
}
