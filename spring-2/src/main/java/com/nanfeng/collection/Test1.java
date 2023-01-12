package com.nanfeng.collection;

import com.nanfeng.collection.autowire.Dept;
import com.nanfeng.collection.autowire.Emp;
import com.nanfeng.collection.bean.MyBeanPost3;
import com.nanfeng.collection.bean.Orders;
import com.nanfeng.collection.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {

    @Test
    public void testListBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    /**
     * 单例验证
     */
    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book b1 = context.getBean("book", Book.class);
        Book b2 = context.getBean("book", Book.class);
        System.out.println(b1);
        System.out.println(b2);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);

    }

    /**
     * bean的生命周期
     */
    @Test
    public void test4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取到对象");
        context.close();
    }

    /**
     * bean的生命周期 带上后置处理器 完整的
     */
    @Test
    public void test5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取到对象");
        context.close();
    }

    /**
     * bean的生命周期 后置处理器自己是否会 传入自己。
     */
    @Test
    public void test6() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        MyBeanPost3 post3 = context.getBean("post3", MyBeanPost3.class);
        System.out.println("第四步 获取到对象");
        context.close();
    }

    /**
     * bean的生命周期 两个普通bean 是否独立执行完整个周期
     */
    @Test
    public void test7() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        Orders order = context.getBean("order", Orders.class);
        System.out.println("第四步 获取到对象");
        context.close();
    }

    /**
     * 自动装配
     */
    @Test
    public void test8() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }
}
