package org.example.textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextField myTextField;
    @FXML
    Label myLabel;

    int age;

    public void login(){
        try {
            age = Integer.parseInt(myTextField.getText());

            if (age >= 18){
                myLabel.setText("You are Login in");
            }
            else{
                myLabel.setText("You are not eligible");
            }

        }
        catch (NumberFormatException e){
            myLabel.setText("Plz enter number");
        }
    }
}