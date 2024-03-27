package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.crapsgame.model.Player;
import org.example.crapsgame.view.GameStage;
import org.example.crapsgame.view.WelcomeStage;
import org.example.crapsgame.view.alert.AlertBox;

import java.io.IOException;

public class WelcomeController {
    private Player player;
    @FXML
    private TextField textFieldSecretWord;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException {
        String secretWord = textFieldSecretWord.getText();
        Player player=new Player(1,secretWord);
        GameStage.getInstance().getGameController().setPlayer(player);
        WelcomeStage.deleteInstance();
    }
    @FXML
    void onHandleButtonHowToPlay(ActionEvent event) {
        String tittle="Instrucciones del juego";
        String header ="Bienvenida";
        String content ="Bienvenida en este juego podrás jugar de la siguiente manera: Primero lanzarás los dados y obtendran dos resultados con valores del 1 al 6";
        AlertBox alertBox=new AlertBox();
        alertBox.showMessage(tittle,header,content);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

