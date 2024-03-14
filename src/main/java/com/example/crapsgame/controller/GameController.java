package com.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class GameController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    private TextArea salidatextarea;
    @FXML
    public void onHandleButtonPlay(ActionEvent event) {
        String nickName=nicknameTextField.getText();
        String msg="Welcome: "+nickName;
        salidatextarea.setText(msg);
    }
    @FXML
    public void onKetNicknameTextField(KeyEvent event) {
        String key = event.getText();
        System.out.println();
    }
}
