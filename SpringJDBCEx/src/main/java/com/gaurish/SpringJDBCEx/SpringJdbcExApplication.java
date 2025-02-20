package com.gaurish.SpringJDBCEx;

import com.gaurish.SpringJDBCEx.model.Student;
import com.gaurish.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollNo(1041);
		student.setName("Pooja");
		student.setMarks(82);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
