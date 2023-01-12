package com.nanfeng.collection.bean;

public class Orders1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 调用set方法 o1");
    }

    public Orders1() {
        System.out.println("第一步 执行无参构造方法 o1");
    }

    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("第三步 执行初始化方法 o1");
    }

    public void destroy() {
        System.out.println("第五步 销毁前执行 o1");
    }
}
