package com.bdqn.controller;


import com.bdqn.entity.Classes;
import com.bdqn.entity.Student;
import com.bdqn.service.ClassService;
import com.bdqn.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by 佳 on 2017/12/11.
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private ClassService classService;
    //默认请求时get请求
    @RequestMapping(value = "list")
    public ModelAndView studentAll() {
        List<Student> list = studentService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList", list);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping(value = "showAdd")
    public String showAdd(Model model) {
        List<Classes> classesList = classService.listClasses();
        model.addAttribute("classesList", classesList);
        return "addStudent";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String addStudent(HttpServletRequest request) throws UnsupportedEncodingException {
        Student student = new Student();
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String tel = request.getParameter("tel");
        String email = request.getParameter("email");
        String classId = request.getParameter("classId");
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setGender(gender);
        student.setTelephone(tel);
        student.setEmail(email);
        student.setClassId(Integer.parseInt(classId));
        Integer row  = studentService.addStudent(student);
        if (row > 0) {
            return "redirect:list";
        }else{
            return "redirect:showAdd";
        }
    }

}
