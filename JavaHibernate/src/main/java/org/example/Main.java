package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        /*Student student = new Student();

        student.setRollNo(17);
        student.setName("Moiez");
        student.setAge(31);*/
        
        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setModel("Macbook Pro");
        laptop.setRam(32);

        Laptop laptop2 = new Laptop();
        laptop2.setLid(2);
        laptop2.setModel("Macbook Air");
        laptop2.setRam(16);

        Alien alien = new Alien();
        
        alien.setAid(101);
        alien.setAname("Gaurish");
        alien.setTech("Java");
        alien.setLaptops(Arrays.asList(laptop, laptop2));

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();


        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // CRUD operations

        session.persist(alien);// create
        session.persist(laptop);// create
        session.persist(laptop2);// create

//        session.get(Student.class, 92); read
//        session.merge(student); update
//        session.remove(student); delete

        transaction.commit();
        session.close();

    }
}