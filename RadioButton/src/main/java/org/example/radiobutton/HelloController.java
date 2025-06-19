package org.example.radiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {
    @FXML
    Label myLabel;

    @FXML
    RadioButton male,female,notSay;

    public void getGender(ActionEvent event){
        if (male.isSelected()){
            myLabel.setText("Male");
        }
        else if (female.isSelected()) {
            myLabel.setText("Female");
        }
        else if (notSay.isSelected()){
            myLabel.setText("Not Say");
        }
    }
}