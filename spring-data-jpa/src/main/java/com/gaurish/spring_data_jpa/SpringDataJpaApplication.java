package com.gaurish.spring_data_jpa;

import com.gaurish.spring_data_jpa.model.Student;
import com.gaurish.spring_data_jpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDataJpaApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);


		StudentRepo studentRepo = context.getBean(StudentRepo.class);

		s1.setRollNo(1);
		s1.setName("Girish");
		s1.setMarks(100);

		s2.setRollNo(2);
		s2.setName("Moiez");
		s2.setMarks(100);

		s3.setRollNo(3);
		s3.setName("Gaurish");
		s3.setMarks(100);

//		studentRepo.save(s1);
//		studentRepo.save(s2);
//		studentRepo.save(s3);

//		System.out.println(studentRepo.findAll());
		System.out.println(studentRepo.findByName("Gaurish"));
//		System.out.println(studentRepo.findByMarksGreaterThan(90));

	}

}
