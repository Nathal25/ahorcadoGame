package com.example.crapsgame.Model;

public interface IAnimal {
    void makeSound();
//    this is a constant, it must have the name in capital letters
    String TYPE = "Animal";

    default void sleep(){
        System.out.println("Tha animal is sleeping");
    }
}
