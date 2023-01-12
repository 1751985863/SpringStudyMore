package com.nanfeng.bean;

public class Emp {

    private String eName;

    private String gender;

    //员工属于某一个部分，使用对象形式表示
    private Dept dept;

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteName() {
        return eName;
    }

    public String getGender() {
        return gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void doSome() {
        System.out.println("doing some");
    }
}
