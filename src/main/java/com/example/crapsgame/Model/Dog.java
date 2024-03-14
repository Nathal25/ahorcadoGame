package com.example.crapsgame.Model;

public class Dog implements IAnimal{
    @Override
    public void makeSound() {
        System.out.println("The dog barks woof woof");
    }
}
