package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Instructor;
import com.tulesh.hibernate.demo.entity.InstructorDetail;
import com.tulesh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            int theId = 3;
            Instructor tempInstructor = session.get(Instructor.class, theId);

            System.out.println("Found instructor ");

            if (tempInstructor != null) {
                System.out.println("Deleting : " + tempInstructor);
                session.delete(tempInstructor);
            } else {
                System.out.println("not deleting");
            }
            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            factory.close();
        }
    }
}






