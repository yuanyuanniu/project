package cn.bdqn.tang.controller;

import cn.bdqn.tang.pojo.TUser;
import cn.bdqn.tang.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by main on 2017/12/8.
 */
@Controller
@RequestMapping("user")
public class TuserController {

    @Autowired
    private TuserService tuserService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(TUser tUser, HttpSession session, Model model) {
        TUser user = tuserService.login(tUser);
        if (user != null) {
            session.setAttribute("user", user);
            return "welcome";
        }
        model.addAttribute("message", "用户名或密码不正确");
        return "index";
    }
}
