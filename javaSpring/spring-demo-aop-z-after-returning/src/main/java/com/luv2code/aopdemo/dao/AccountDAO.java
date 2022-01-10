package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public List<Account> findAccount(){
        List<Account> myAccounts=new ArrayList<>();

        Account temp1=new Account("Tulesh","level 1");
        Account temp2=new Account("John","level 2");
        Account temp3=new Account("jenish","level 3");

        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;
    }

    public void addAccount(Account theAccount,boolean vipFlag){
        System.out.println(getClass()+" : Doing my DB work an account");

    }
    public  boolean doWork(){
        System.out.println(getClass()+" : doWork() ");
        return false;
    }

    public String getName() {
        System.out.println(getClass()+" : is getName() ");
        return name;
    }

    public AccountDAO setName(String name) {
        System.out.println(getClass()+" : setName() ");
        this.name = name;
        return this;
    }

    public String getServiceCode() {
        System.out.println(getClass()+" : getServiceCode() ");
        return serviceCode;
    }

    public AccountDAO setServiceCode(String serviceCode) {
        System.out.println(getClass()+" : setServiceCode() ");
        this.serviceCode = serviceCode;
        return this;
    }
}
