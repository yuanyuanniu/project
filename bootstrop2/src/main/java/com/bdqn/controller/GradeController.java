package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Grade;
import com.bdqn.service.GradeService;
import com.bdqn.util.Message;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony on 2017/12/9.
 */
@Controller
@RequestMapping("grade")
public class GradeController {
    @Resource
    private GradeService gradeService;
    @ResponseBody
    @RequestMapping(value = "updateGrade",method = RequestMethod.POST,
            produces = {"application/json;charset=utf-8"})
    public String updateGrade(Grade grade){
        int n=gradeService.updateGrade(grade);
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
    @ResponseBody
    @RequestMapping(value = "addGrade",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public String addGrade(Grade grade) {
        int n = gradeService.addGrade(grade);
        System.out.println(JSON.toJSONString(Message.success()));
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }

        return JSON.toJSONString(Message.error());
    }

    @RequestMapping("toGrade")
    public String toGrade(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Grade> pageInfo= gradeService.queryAll(pageNum,pageSize);
        model.addAttribute("pageInfo",pageInfo);

        return "grade/grade";
    }
    @ResponseBody
    @RequestMapping(value ="queryGradeById",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public String queryGradeById(Integer gradeId){
        Grade grade=gradeService.queryGradeById(gradeId);
        return JSON.toJSONString(grade);
    }

    @ResponseBody
    @RequestMapping(value = "deleteGradeById",method = RequestMethod.POST,
            produces ={"application/json;charset=UTF-8"} )
    public String deleteGradeById(Integer gradeId) {
        int n=gradeService.deleteGradeById(gradeId);
        if(n>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }

    @ResponseBody
    @RequestMapping(value = "deleteGradeByIds",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public String deleteGradeByIds(String gradeIds){
        String[] gradeIdArray=gradeIds.split(",");
        List<Integer> list = new ArrayList<Integer>();
        for (String s : gradeIdArray) {
            list.add(Integer.parseInt(s));
        }

        int n=gradeService.deleteGradeByIds(list);

        if(n>0){
            return JSON.toJSONString(Message.success());
        }

        return JSON.toJSONString(Message.error());
    }
    @ResponseBody
    @RequestMapping(value = "queryAllGrade",method = RequestMethod.GET,
    produces = {"application/json;charset=utf-8"})
    public String queryAllGrade(){
        List<Grade> list=gradeService.queryAll();
        System.out.println(JSON.toJSONString(list));
        return JSON.toJSONString(list);

    }

}
