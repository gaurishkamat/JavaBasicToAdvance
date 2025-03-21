package com.jobportal.SpringBootRest.service;

import com.jobportal.SpringBootRest.model.User;
import com.jobportal.SpringBootRest.model.UserPrincipal;
import com.jobportal.SpringBootRest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public UserDetails loadUserByUsername(String username){
        User user = userRepo.findByUsername(username);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }
        return new UserPrincipal(user);
    }
}
