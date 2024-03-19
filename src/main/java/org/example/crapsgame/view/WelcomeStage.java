package org.example.crapsgame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {
    private WelcomeStage welcomeStage;

    public WelcomeStage() throws IOException {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/org/example/crapsgame/welcome-view.fxml"));
        Parent parent = loader.load();
        setTitle("CrapsGame");
        Scene scene=new Scene(parent);
        setScene(scene);
        setResizable(false);
        show();
    }
    private static class WelcomeStageHolder{
        private static WelcomeStage INSTANCE;
    }
    public static WelcomeStage getInstance() throws IOException {
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }

}
