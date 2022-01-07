package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentsDemo {
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

            Course tempCourse=new Course("Course 3");

            System.out.println("\nSaving course");
            System.out.println(tempCourse);

            Student tempStudent1=new Student("a1","a2","a3@gmail.com");
            Student tempStudent2=new Student("b1","b2","b3@gmail.com");

            tempCourse.addStudent(tempStudent1);
            tempCourse.addStudent(tempStudent2);

            System.out.println("\nSaving student...");
            session.save(tempStudent1);
            session.save(tempStudent2);

            System.out.println("saved student : "+tempCourse.getStudents());

            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            session.close();
            factory.close();
        }
    }
}






