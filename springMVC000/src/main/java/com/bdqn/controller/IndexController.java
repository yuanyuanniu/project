package com.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by sony on 2017/12/2.
 */
@Controller

public class IndexController {
    @RequestMapping(value = "index" , method= RequestMethod.POST)

    public String index(String userName, Map<String,Object> model){
        System.out.println("userName"+userName);
        if(!"aa".equals(userName)){
            throw new RuntimeException("用户名错误!");
        }
        model.put("username",userName);
        return "welcome";
    }
    @ExceptionHandler(value ={RuntimeException.class})
    public String handlerexception(RuntimeException e, HttpServletRequest request){
        request.setAttribute("e",e);
        return "error";
    }
    /*@RequestMapping(value = "index" , method= RequestMethod.POST)


    //model一般最后写 model与逻辑无关
    public String index(String userName, Model model){
        System.out.println("userName"+userName);
        model.addAttribute("username",userName);
        return "welcome";
    }*/
    /*@RequestMapping("index")
    public ModelAndView index(String userName){
        System.out.println("hello" + userName);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username",userName);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }*/
    /*@RequestMapping(value = "index" , method= RequestMethod.GET)

    public String index(@RequestParam(value = "userName") String userName){
        System.out.println("userName"+userName);
        return "index";
    }*/
    /*@RequestMapping("index")
    public String index(){
        System.out.println("欢迎你jsfk");
        return "index";
    }*/
    /*@RequestMapping("/index")
    public String index(){
        System.out.println("欢迎你jsfk");
        return "index";
    }*/
   /* @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("欢迎你springMvc");
        return new ModelAndView("welcome");
    }*/
}
