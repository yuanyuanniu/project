package cn.bdqn.tang.service;

import cn.bdqn.tang.pojo.TUser;
import com.github.pagehelper.PageInfo;

/**
 * Created by main on 2017/12/8.
 */
public interface TuserService {
    TUser login(TUser tUser);

    PageInfo<TUser> pageInfo(Integer pageNum, Integer pageSize);


}
