package com.jobportal.SpringBootRest.repo;


import com.jobportal.SpringBootRest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepo implements JpaRepository<User, Integer> {
}
