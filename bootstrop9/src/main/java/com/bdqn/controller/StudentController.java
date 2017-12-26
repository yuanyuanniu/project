package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Student;
import com.bdqn.service.StudentService;
import com.bdqn.util.Message;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Resource
    private StudentService studentService;
@RequestMapping(value = "deleteStudentByIds",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String deleteStudentByIds(String ids){
    String[] idsArray=ids.split(",");
    List<Integer> idList=new ArrayList<Integer>();
    for (String s : idsArray) {
        idList.add(Integer.parseInt(s));
    }
    int n=studentService.deleteStudentByIds(idList);
    if(n>0){
        return JSON.toJSONString(Message.success());
    }
    return JSON.toJSONString(Message.error());

}
@RequestMapping("toStudent")
    public String toStudent(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Student> pageInfo=studentService.queryAll(pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);
        return "student/student";
    }
}
