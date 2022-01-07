package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Course;
import com.tulesh.hibernate.demo.entity.Instructor;
import com.tulesh.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLazyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            int theId=1;
            Instructor tempInstructor=session.get(Instructor.class,theId);

            System.out.println("gtmovie Instruction : "+tempInstructor);
            System.out.println("Courses : "+tempInstructor.getCourses());

//            System.out.println("Courses : "+tempInstructor.getCourses());

            session.getTransaction().commit();
            session.close();
            System.out.println("\n session close \n");
            System.out.println("Courses : "+tempInstructor.getCourses());
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            session.close();
            factory.close();
        }
    }
}






