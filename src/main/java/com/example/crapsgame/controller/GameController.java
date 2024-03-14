package com.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class GameController {
    /*
    @FXML
    private TextField nicknameTextField;

    @FXML
    private TextArea salidatextarea;
    @FXML
    public void onHandleButtonPlay(ActionEvent event) {
        String secretWord="Vida";
        String nickName=nicknameTextField.getText();
        String msg="Welcome: "+nickName;
        salidatextarea.setText(msg);
    }
    @FXML
    public void onKetNicknameTextField(KeyEvent event) {
        String key = event.getText();
        System.out.println(key);
    }
     */
    @FXML
    private TextField nickNameTextField1;

    @FXML
    private TextField nickNameTextField2;

    @FXML
    private TextField nickNameTextField3;

    @FXML
    private TextField nickNameTextField4;

    @FXML
    private TextArea textArea;
    String secretWord="vida";
    @FXML
    public void onHandleButtonPlay(ActionEvent event) {
        String letter0=nickNameTextField1.getText();
        String letter1=nickNameTextField2.getText();
        String letter2=nickNameTextField3.getText();
        String letter3=nickNameTextField4.getText();
        String finalWord=letter0.concat(letter1.concat(letter2.concat(letter3)));
        textArea.setText(finalWord);
        if(finalWord.equals(secretWord)){
            textArea.setText("Felicidades, haz encontrado la palabra secreta!");
        }else {
            textArea.setText("Sigue intentando");
        }
    }
    @FXML
    public void onKetNicknameTextField(KeyEvent event) {
        String key = event.getText();
        System.out.println(key);
    }
}
