package org.example.communicationbetweencontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondPageController {

    @FXML
    TextField UserText;

    public void display(String s){
        UserText.setText("Hi " + s);
    }
}
