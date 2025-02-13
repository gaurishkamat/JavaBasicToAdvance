package com.gaurish;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Gaurish");
        student.setRollNo(26);
        student.setAge(36);

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(com.gaurish.Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.persist(student);

        session.close();
    }
}
