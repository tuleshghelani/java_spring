package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            int studentId=10;
            session=factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\n Getting student id with id : "+studentId);
            Student mystudent=session.get(Student.class,studentId);

            System.out.println("Updating student ");
            mystudent.setFirstName("Jenish");
            session.getTransaction().commit();

            //New code

            session=factory.getCurrentSession();
            session.beginTransaction();

            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            factory.close();
        }
    }
}






