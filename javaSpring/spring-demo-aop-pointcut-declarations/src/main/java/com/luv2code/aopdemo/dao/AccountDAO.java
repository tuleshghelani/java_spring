package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(Account theAccount,boolean vipFlag){
        System.out.println(getClass()+" : Doing my DB work an account");

    }
    public  boolean doWork(){
        System.out.println(getClass()+" : doWork() ");
        return false;
    }
}
