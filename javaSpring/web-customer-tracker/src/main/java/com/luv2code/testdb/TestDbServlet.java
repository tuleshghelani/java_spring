package com.luv2code.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import  java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user="postgres";
        String pass="123456";

        String jdbcUrl="jdbc:postgresql://localhost:5432/web_customer_tracker";
        String driver="org.postgresql.Driver";

        try {
            PrintWriter out=response.getWriter();
            out.println("connecting  "+jdbcUrl);
            Class.forName(driver);

            Connection myconn= DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("successfully connection :");
            myconn.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("error");
            throw new ServletException(e);
        }

    }
}
