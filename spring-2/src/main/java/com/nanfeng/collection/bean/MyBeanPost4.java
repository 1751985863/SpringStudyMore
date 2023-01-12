package com.nanfeng.collection.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost4 implements BeanPostProcessor {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 执行set方法 p4");
    }

    public MyBeanPost4() {
        System.out.println("第一步 执行无参构造 p4");
    }

    public void initMethod() {
        System.out.println("第三步 init方法 p4");
    }

    public void destroyMethod() {
        System.out.println("第五步 destroy方法 p4");
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前执行的方法 post4");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后执行的方法 post4");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
