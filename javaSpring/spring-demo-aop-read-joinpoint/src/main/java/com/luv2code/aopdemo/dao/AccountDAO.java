package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

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
