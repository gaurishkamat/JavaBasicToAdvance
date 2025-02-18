package com.gaurish.SpringBootDemo.service;

import com.gaurish.SpringBootDemo.LaptopRepository;
import com.gaurish.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repository;

    public void addLaptop(Laptop laptop){
        repository.save(laptop);
    }
}
