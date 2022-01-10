package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {


//    @Before("execution(public void updateAccount())")
//    @Before("execution(public void add*())")


    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint){
        System.out.println("\n =======>>  execute @Before on Account");

        MethodSignature methodsig=  (MethodSignature) theJoinPoint.getSignature();

        System.out.println("Method : "+methodsig);

        Object[] args=theJoinPoint.getArgs();

        for (Object tempArg:args){
            System.out.println(""+tempArg);
            if(tempArg instanceof Account){
                Account theAccount = (Account) tempArg;
                System.out.println("Account name : "+theAccount.getName());
                System.out.println("Account level : "+theAccount.getLevel());
            }
        }

    }


}
