package cn.bdqn.tang.dao;

import cn.bdqn.tang.pojo.TUser;

import java.util.List;

/**
 * Created by main on 2017/12/8.
 */
public interface TuserMapper {
    TUser login(TUser tUser);

    List<TUser> queryAll();
}
