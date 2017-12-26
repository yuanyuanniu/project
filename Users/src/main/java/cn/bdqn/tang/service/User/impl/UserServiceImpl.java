package cn.bdqn.tang.service.User.impl;

import cn.bdqn.tang.dao.Users.UsersDaoMapper;
import cn.bdqn.tang.pojo.Users;
import cn.bdqn.tang.service.User.UserService;
import cn.bdqn.tang.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by main on 2017/12/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDaoMapper usersDaoMapper;


    @Override
    public Users queryUserById(Integer id) {
        return usersDaoMapper.queryUserById(id);
    }

    @Override
    public int updataPassword(Integer id, String password) {
        return usersDaoMapper.updataPassword(id,password);
    }

    @Override
    public List<Users> listUserByName(String userName, PageUtils pageUtils) {
        pageUtils.setTotalCount(usersDaoMapper.count(userName));

        return usersDaoMapper.listUserByName(userName, pageUtils.getFrom(), pageUtils.getPageSize());

    }




}
