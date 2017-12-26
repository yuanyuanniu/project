package com.bdqn.entity;

/**
 * Created by sony on 2017/12/11.
 */
public class Classes {
    private int id;
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
