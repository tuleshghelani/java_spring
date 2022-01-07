package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCoursesForMaryDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();

            int studentId=2;
            Student tempStudent= session.get(Student.class,studentId);
            System.out.println("\n loaded student : "+tempStudent);
            System.out.println("\n courses : "+tempStudent.getCourses());

            Course tempCourse1=new Course("c - 1");
            Course tempCourse2=new Course("c - 2");

            tempCourse1.addStudent(tempStudent);
            tempCourse2.addStudent(tempStudent);

            System.out.println("\nSaving the courses ");

            session.save(tempCourse1);
            session.save(tempCourse2);

            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            session.close();
            factory.close();
        }
    }
}






