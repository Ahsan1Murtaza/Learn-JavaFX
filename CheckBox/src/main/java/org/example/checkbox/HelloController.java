package org.example.checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    Label myLabel;

    @FXML
    CheckBox myCheckBox;

    @FXML
    ImageView myImageView;

    Image imageOn = new Image(getClass().getResourceAsStream("img.png"));
    Image imageOff = new Image(getClass().getResourceAsStream("img_1.png"));

    public void Change(){
        if (myCheckBox.isSelected()){
            myLabel.setText("On");
            myImageView.setImage(imageOn);

        }
        else{
            myLabel.setText("Off");
            myImageView.setImage(imageOff);
        }
    }


}