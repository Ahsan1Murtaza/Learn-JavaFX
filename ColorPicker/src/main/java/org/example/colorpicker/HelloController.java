package org.example.colorpicker;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private ColorPicker myColorPicker;

    @FXML
    Pane myPane;

    public void changeColor(){
        Color color = myColorPicker.getValue();

        myPane.setBackground(new Background(new BackgroundFill(color, null, null)));
    }
}