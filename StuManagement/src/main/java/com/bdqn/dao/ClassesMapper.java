package com.bdqn.dao;


import com.bdqn.entity.Classes;

import java.util.List;

/**
 * Created by main on 2017/12/11.
 */
public interface ClassesMapper {

    /**
     *查询所有班级信息
     * @return
     */
    List<Classes> listClasses();
}
