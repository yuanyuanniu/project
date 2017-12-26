package com.bdqn.controller;

import com.bdqn.entity.Tuser;
import com.bdqn.service.TuserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by sony on 2017/12/9.
 */
@Controller
@RequestMapping("user")
public class TuserController {
    @Resource
    private TuserService tuserService;
    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    public String login(Tuser tuser, HttpSession session, Model model){
        Tuser user = tuserService.login(tuser);
        if (user != null) {
            session.setAttribute("user",user);
            return "welcome";
        }
        model.addAttribute("message","用户名密码错误");
        session.removeAttribute("user");
        return "index";
    }
    @RequestMapping("loginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("user");
        return "index";
    }
}
