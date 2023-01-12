package com.nanfeng;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxyTest {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        //创建接口实现类代理对象
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(),
                interfaces, new UserDaoProxy(userDao));
        int add = userDao1.add(1, 3);
        System.out.println(add);
        userDao1.update("1");

    }
}
class UserDaoProxy implements InvocationHandler {

    //1.创建的是谁的代理对象，把谁传递过来
    //有参数构造传递

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        if (method.getName().equals("add")) {
            System.out.println("方法之前执行----"+method.getName()+":传递的参数"+ Arrays.toString(args));

            //被增强的方法执行
             res = method.invoke(obj,args);

            //方法之后
            System.out.println("方法之后执行-----"+obj);
        }
        else {
            res = method.invoke(obj,args);
        }
        //方法之前


        return res;
    }
}
