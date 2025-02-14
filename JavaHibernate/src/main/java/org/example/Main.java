package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Student student = new Student();

        student.setRollNo(17);
        student.setName("Moiez");
        student.setAge(31);

        Class.forName("org.postgresql.Driver");

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Student.class)
                .buildSessionFactory();


        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // CRUD operations

        session.persist(student); // create
//        session.get(Student.class, 92); read
//        session.merge(student); update
//        session.remove(student); delete

        transaction.commit();
        session.close();

    }
}