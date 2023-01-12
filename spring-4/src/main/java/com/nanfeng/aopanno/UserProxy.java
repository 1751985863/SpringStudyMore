package com.nanfeng.aopanno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserProxy {


    // 使用before表示前置通知
    @Before(value = "execution(* com.nanfeng.aopanno.User.add(..))")
    //前置通知
    public void before() {
        System.out.println("before-----");
    }

    @After(value = "execution(* com.nanfeng.aopanno.User.add(..))") // 最终通知
    public void after() {
        System.out.println("after-----最终通知");
    }

    @AfterReturning(value = "execution(* com.nanfeng.aopanno.User.add(..))") //后置通知
    public void AfterReturning() {
        System.out.println("后置通知-----");
    }

    @AfterThrowing(value = "execution(* com.nanfeng.aopanno.User.add(..))") //异常通知
    public void afterThrowing() {
        System.out.println("异常通知-----");
    }

    @Around(value = "execution(* com.nanfeng.aopanno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕之前-----");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后-----");
    }
}
