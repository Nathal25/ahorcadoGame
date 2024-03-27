package org.example.crapsgame;

import org.example.crapsgame.view.WelcomeStage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    //Verificando conexion
    //Prueba respecto a cambios
    //Prueba conexion 2 auxiliosdfa
    //prueba final
    public static void main(String[] args) {launch(args);}
    @Override
    public void start(Stage primaryStage) throws IOException {
        WelcomeStage.getInstance();
    }
}
