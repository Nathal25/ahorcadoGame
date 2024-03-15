package com.example.crapsgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
//Demostración conexion
    public static void main(String[] args)
   {
       launch(args);
       /**

       Button button=new Button("Do click here");
       //Lo de abajo es una instancia anonima

       TextField txtField=new TextField("Hi");
       txtField.setOnKeyPressed(new EventHandler<KeyEvent>() {
           @Override
           public void handle(KeyEvent keyEvent) {
               System.out.println("");
           }
       });
       **/
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
