package org.example.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    ImageView myImageView;

    Image image = new Image(getClass().getResourceAsStream("img.png"));

    public void changeImage(){
        myImageView.setImage(image);
    }


}