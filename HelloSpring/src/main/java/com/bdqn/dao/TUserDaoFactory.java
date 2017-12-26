package com.bdqn.dao;

/**
 * Created by sony on 2017/11/25.
 */
public class TUserDaoFactory {
    public static TUserDao getInstance() {
        TUserDao userDao=new TUserDaoImpl();
        return userDao;
    }
}
