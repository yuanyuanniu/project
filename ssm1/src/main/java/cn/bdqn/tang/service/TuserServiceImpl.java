package cn.bdqn.tang.service;

import cn.bdqn.tang.dao.TuserMapper;
import cn.bdqn.tang.pojo.TUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by main on 2017/12/8.
 */
@Service("userService")
public class TuserServiceImpl implements TuserService {
    @Autowired
    private TuserMapper tuserMapper;
    @Override
    public TUser login(TUser tUser) {
        return tuserMapper.login(tUser);
    }

    @Override
    public PageInfo<TUser> pageInfo(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TUser> userList = tuserMapper.queryAll();
        PageInfo<TUser> pageInfo = new PageInfo<TUser>(userList);

        return pageInfo;
    }
}
