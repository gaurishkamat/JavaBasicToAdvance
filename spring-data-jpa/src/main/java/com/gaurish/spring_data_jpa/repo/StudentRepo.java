package com.gaurish.spring_data_jpa.repo;

import com.gaurish.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
