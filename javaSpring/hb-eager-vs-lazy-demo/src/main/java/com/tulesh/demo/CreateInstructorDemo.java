package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Course;
import com.tulesh.hibernate.demo.entity.Instructor;
import com.tulesh.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Instructor tempInstructor=new Instructor("Tulesh","ghelani","gtr@gmail.com");

            InstructorDetail tempInstructorDetail=new InstructorDetail("www.gtmovie.com/","gtmovie - all movie available here");

//            Instructor tempInstructor=new Instructor("Tulesh12","ghelani12","gt12312@gmail.com");
//
//            InstructorDetail tempInstructorDetail=new InstructorDetail("www.gtmovie.com/12","gtmovie12 - all movie available here");
            tempInstructor.setInstructorDetail(tempInstructorDetail);

            session.beginTransaction();

            System.out.println("saving instructor : "+tempInstructor);
            session.save(tempInstructor);


            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            session.close();
            factory.close();
        }
    }
}






