package com.bdqn.entity;

/**
 * Created by sony on 2017/12/11.
 */
/*
idint(11) NOT NULL学员编号
namevarchar(40) NOT NULL学员姓名
ageint(11) NOT NULL年龄
gendervarchar(40) NOT NULL性别
telephonevarchar(33) NOT NULL电话
emailvarchar(50) NOT NULL邮箱
classIdint(11) NOT NULL班级编号
 */
public class Student {
    private Integer id,age,classId;
    private String name,gender,telephone,email,className;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", classId=" + classId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", className='" +  + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
