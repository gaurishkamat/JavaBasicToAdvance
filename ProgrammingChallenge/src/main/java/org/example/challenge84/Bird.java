package org.example.challenge84;

public abstract class Bird implements Flyable{
    public String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void fly();
}
