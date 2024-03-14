package com.example.crapsgame;

import com.example.crapsgame.Model.CustomMouseListener;
import com.example.crapsgame.Model.Dog;
import com.example.crapsgame.Model.IAnimal;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args)
   {
       launch(args);
       /*
       Dog myPuppy = new Dog();
       myPuppy.makeSound();
       System.out.println(IAnimal.TYPE);
       CustomMouseListener cML =new CustomMouseListener();
       cML.mouseClicked();
       cML.mousePressed();

       Button button=new Button("Do click here");
       //Lo de abajo es una instancia anonima
       button.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               System.out.println("Click");
           }
       });
       TextField txtField=new TextField("Hi");
       txtField.setOnKeyPressed(new EventHandler<KeyEvent>() {
           @Override
           public void handle(KeyEvent keyEvent) {
               System.out.println("");
           }
       });
       */
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/com/example/crapsgame/welcome-view.fxml"));
        Parent parent = loader.load();
        primaryStage.setTitle("CrapsGame");
        Scene scene=new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
