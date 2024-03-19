package com.example.crapsgame.view;

import com.example.crapsgame.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameStage extends Stage {
    private GameController gameController;

    public GameStage() throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/com/example/crapsgame/game-view.fxml"));
        Parent root = loader.load();
        setTitle("CrapsGame");
        Scene scene=new Scene(root);
        setScene(scene);
        show();
    }
    private static class GameStageHolder{
        private static GameStage INSTANCE;
    }
    public static GameStage getInstance() throws IOException {
        return GameStageHolder.INSTANCE = new GameStage();
    }
    public GameController getGameController() {
        return gameController;
    }
}
