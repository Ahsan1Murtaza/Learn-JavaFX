package org.example.choicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    Label myLabel;

    @FXML
    ChoiceBox<String> myChoiceBox;

    private final String[] items = {"Pizza", "Sushi", "Ramen"};

    public void initialize(URL arg0, ResourceBundle arg1){
        myChoiceBox.getItems().addAll(items);
        myChoiceBox.setOnAction(this::getItem);
    }

    public void getItem(ActionEvent event){
        String item = myChoiceBox.getValue();
        System.out.println(item);
        myLabel.setText(item);
    }


}