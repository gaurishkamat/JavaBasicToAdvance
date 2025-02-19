package com.gaurish.SpringBootDemo.repo;

import com.gaurish.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Saved in Database");
    }
}
