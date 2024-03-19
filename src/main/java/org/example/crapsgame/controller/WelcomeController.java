package org.example.crapsgame.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.example.crapsgame.Model.Player;
import org.example.crapsgame.view.GameStage;
import org.example.crapsgame.view.WelcomeStage;


import java.io.IOException;


public class WelcomeController {

    @FXML
    private TextField nickNameTextField1;

    @FXML
    private TextField nickNameTextField2;

    @FXML
    private TextField nickNameTextField3;

    @FXML
    private TextField nickNameTextField4;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException {
        String letter0=nickNameTextField1.getText();
        String letter1=nickNameTextField2.getText();
        String letter2=nickNameTextField3.getText();
        String letter3=nickNameTextField4.getText();
        String finalWord=letter0.concat(letter1.concat(letter2.concat(letter3)));
        System.out.println(finalWord);
        Player player=new Player(1,finalWord);
        GameStage.getInstance().getGameController().setPlayer(player);

    }

    @FXML
    void onKetNicknameTextField(KeyEvent event) {
        String key = event.getText();
        System.out.println(key);
    }

}

