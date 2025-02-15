package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private Integer lid;
    private String model;
    private Integer ram;
    @ManyToMany(mappedBy = "laptops")
    private List<Alien> aliens;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(List<Alien> alien) {
        this.aliens = aliens;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
