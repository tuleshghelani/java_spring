package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);

        List<Account> theAccounts=theAccountDAO.findAccount();

        System.out.println("\n\n Main program @after-return");
        System.out.println("-------");
        System.out.println(theAccounts);

        context.close();
    }
}
