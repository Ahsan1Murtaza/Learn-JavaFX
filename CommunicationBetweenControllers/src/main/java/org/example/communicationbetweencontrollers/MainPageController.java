package org.example.communicationbetweencontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class MainPageController {
    Stage stage;
    Scene scene;
    Parent root;
    @FXML
    TextField textField;

    public void login(ActionEvent event) throws IOException {

        String username = textField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondPage.fxml"));
        root = loader.load();

        SecondPageController secondPageController = loader.getController();
        secondPageController.display(username);


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}