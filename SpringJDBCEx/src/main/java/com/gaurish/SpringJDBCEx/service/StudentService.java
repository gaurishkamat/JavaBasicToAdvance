package com.gaurish.SpringJDBCEx.service;

import com.gaurish.SpringJDBCEx.model.Student;
import com.gaurish.SpringJDBCEx.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private StudentRepository repository;

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {
        repository.save(student);
    }

    public List<Student> getStudents() {
       return repository.findAll();
    }
}
