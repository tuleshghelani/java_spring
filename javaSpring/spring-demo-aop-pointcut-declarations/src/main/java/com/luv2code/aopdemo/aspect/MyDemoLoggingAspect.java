package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {


//    @Before("execution(public void updateAccount())")
//    @Before("execution(public void add*())")
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage(){

    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n =======>>  execute @Before on Account");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("\n======>> performing API analytics");
    }
}
