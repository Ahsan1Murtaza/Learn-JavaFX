package org.example.logout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    Button logoutButton;

    Stage stage;
    Scene scene;

    public void logout(ActionEvent event){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout!");
        alert.setHeaderText("You are about to logout");
        alert.setContentText("Do you want to save before exiting ?");

        if (alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            System.out.println("You logout");
            stage.close();
        }
    }
}