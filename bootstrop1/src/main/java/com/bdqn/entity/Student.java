package com.bdqn.entity;

/**
 * Created by sony on 2017/12/13.
 */
public class Student {
    private Integer id,age;
    private String studentName,gender,studentNum;
    private Grade grade;

    @Override
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", grade=" + grade +
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
