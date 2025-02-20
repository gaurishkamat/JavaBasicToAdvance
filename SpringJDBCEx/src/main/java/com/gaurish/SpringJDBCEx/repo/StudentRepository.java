package com.gaurish.SpringJDBCEx.repo;

import com.gaurish.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s) {
        String sqlQuery = "insert into student(rollNo, name, marks) values(?,?,?)";
        int rows = jdbcTemplate.update(sqlQuery, s.getRollNo(), s.getName(), s.getMarks());
        System.out.printf("%d row(s) affected\n", rows);
    }

    public List<Student> findAll() {
        String sqlQuery = "select * from student";

        RowMapper<Student> mapper = (rs, rowNum) -> {
                Student student = new Student();
                student.setRollNo(rs.getInt("rollNo"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));
                return student;
        };

        return jdbcTemplate.query(sqlQuery, mapper);
    }
}
