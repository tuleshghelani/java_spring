package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            System.out.println("Creating  a new student object");
            Student tempStudent=new Student("Tulesh1","ghelani1","GTR1@gmail.com");
            session.beginTransaction();

            System.out.println("saving the student");
            System.out.println(tempStudent);
            session.save(tempStudent);

            session.getTransaction().commit();

            System.out.println("Saved student generated id : "+tempStudent.getId());
            session =factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Getting student id : "+tempStudent.getId());
            Student mystudent=session.get(Student.class,tempStudent.getId());

            System.out.println("get complted : "+mystudent);

            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            factory.close();
        }
    }
}






