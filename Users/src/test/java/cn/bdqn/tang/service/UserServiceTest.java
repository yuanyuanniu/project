package cn.bdqn.tang.service;


import cn.bdqn.tang.pojo.Users;
import cn.bdqn.tang.service.User.impl.UserServiceImpl;
import cn.bdqn.tang.util.PageUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by main on 2017/12/4.
 */

public class UserServiceTest {
    @org.junit.Test
    public void queryUserById() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        System.out.println(userService.queryUserById(3));
    }

    @org.junit.Test
    public void updataPassword() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        System.out.println(userService.updataPassword(3,"999999999999999"));
    }

    @org.junit.Test
    public void listUserByName() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");

        Integer pageSize = 2;
        Integer currPage = 2 ;
        String userName = "周";
        PageUtils pageUtils = new PageUtils();
        pageUtils.setPageSize(pageSize);
        pageUtils.setCurrPageNo(currPage);
        List<Users> users = userService.listUserByName(userName,pageUtils);
        System.out.println("当前页"+currPage+"总记录数"+pageUtils.getTotalCount()+"页长"+pageSize+"总页数"+pageUtils.getTotolPage());
        for (Users user : users) {
            System.out.println(user);
        }

    }



}
