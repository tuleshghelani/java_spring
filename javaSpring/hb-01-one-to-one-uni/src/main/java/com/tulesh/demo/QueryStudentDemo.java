package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
//            System.out.println("Creating a new student object");
//            Student tempStudent=new Student("Tulesh2","ghelani2","GTR2@gmail.com");
            session.beginTransaction();
            List<Student> theStudent =session.createQuery("from Student").list();
            displayStudents(theStudent);

            theStudent=session.createQuery("from Student s where s.lastName='ghelani1'").getResultList();
            System.out.println("\n simple query");
            displayStudents(theStudent);

            theStudent=session.createQuery("from Student s where s.lastName='ghelani1' or s.firstName='Tulesh2'").list();
            System.out.println("\n or operator");
            displayStudents(theStudent);

            theStudent=session.createQuery("from Student s where s.email like '%gtmovie.com' ").list();
            System.out.println("\n like");
            displayStudents(theStudent);


//            session.save(tempStudent);

            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudent) {
        for (Student tempStu: theStudent){
            System.out.println(tempStu);
        }
    }
}






