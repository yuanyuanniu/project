package com.bdqn.service;

import com.bdqn.dao.ClassesMapper;
import com.bdqn.entity.Classes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sony on 2017/12/11.
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassesMapper classesMapper;
    @Override
    public List<Classes> listClasses() {
        return classesMapper.listClasses();
    }
}
