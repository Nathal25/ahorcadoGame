package com.example.crapsgame.Model;

public class CustomMouseListener extends MouseAdapter{
    @Override
    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }
}
