package org.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("img.png");

        stage.setTitle("Desktop app");
        stage.getIcons().add(icon);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setFullScreen(true);
//        stage.setResizable(false);
        stage.setFullScreenExitHint("Press e to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("e"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}