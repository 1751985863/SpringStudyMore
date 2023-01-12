package com.nanfeng.test;

import com.nanfeng.Book;
import com.nanfeng.Order;
import com.nanfeng.User;
import com.nanfeng.bean.Dept;
import com.nanfeng.bean.Emp;
import com.nanfeng.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void testCreateXml() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void testSet() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        String name = book.getbName();
        System.out.println(name);

    }

    @Test
    public void testConstruct() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanOrder.xml");
        Order book = context.getBean("order", Order.class);
        String address = book.getAddress();
        System.out.println(address);

    }

    /**
     * P名称空间注入
     */
    @Test
    public void testSetP() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanP.xml");
        Book book = context.getBean("book", Book.class);
        String name = book.getbName();
        System.out.println(name);

    }

    /**
     * 配置空值
     */
    @Test
    public void testSetNull() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        String address = book.getAddress();
        System.out.println(address);

    }

    /**
     * 配置特殊符号--CDATA
     */
    @Test
    public void testSetSpecialChar() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        String age = book.getAge();
        System.out.println(age);
    }

    /**
     * 配置特殊符号--转义
     */
    @Test
    public void testShift() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        String bank = book.getBank();
        System.out.println(bank);
    }

    @Test
    public void testAdd() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();


    }

    /**
     * 外部bean
     */
    @Test
    public void testInnerBean() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.doSome();


    }

    /**
     * 级联赋值
     */
    @Test
    public void testAndBean() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        String s = emp.getDept().getdName();
        System.out.println(s);


    }
}
