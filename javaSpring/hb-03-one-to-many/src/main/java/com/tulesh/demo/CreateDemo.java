package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Instructor;
import com.tulesh.hibernate.demo.entity.InstructorDetail;
import com.tulesh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Instructor tempInstructor=new Instructor("Tulesh8","ghelani8","gt1238@gmail.com");

            InstructorDetail tempInstructorDetail=new InstructorDetail("www.gtmovie.com/8","gtmovie8 - all movie available here");

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
            factory.close();
        }
    }
}






