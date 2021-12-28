package com.tulesh.demo;

import com.tulesh.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            int studentId=5;
            session=factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("\n Getting student id with id : "+studentId);
            Student mystudent=session.get(Student.class,studentId);

//            System.out.println("deleting student : "+mystudent);
//            session.delete(mystudent);

            System.out.println("Deleting student id =6 ");
            session.createQuery("delete from Student where id=6").executeUpdate();
            session.getTransaction().commit();
            System.out.println("Done ! ");
        } catch (Exception e) {

        } finally {
            factory.close();
        }
    }
}






