package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
        MembershipDAO theMembershipDAO=context.getBean("membershipDAO",MembershipDAO.class);

        Account myAccount=new Account();
        theAccountDAO.addAccount(myAccount,true);
        theAccountDAO.doWork();

        theAccountDAO.setName("Tulesh");
        theAccountDAO.setServiceCode("Service -1 ");

        String name=theAccountDAO.getName();
        String code=theAccountDAO.getServiceCode();

        theMembershipDAO.addSillyMember();
        theMembershipDAO.goToSleep();

        context.close();
    }
}
