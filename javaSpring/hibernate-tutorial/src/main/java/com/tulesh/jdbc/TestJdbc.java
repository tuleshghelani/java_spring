package com.tulesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl="jdbc:postgresql://localhost:5432/hb_student_tracker";
        String user="postgres";
        String password="123456";
        try {
            System.out.println("connecting to database");

            Connection myconn= DriverManager.getConnection(jdbcUrl,user,password);
            System.out.println("Connection successfully ");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
