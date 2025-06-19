package org.example.progressbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    ProgressBar myProgressBar;

    @FXML
    Label myLabel;

    BigDecimal progress = new BigDecimal("0.0");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressBar.setStyle("-fx-accent: red;"); // Css Property
    }

    public void increaseProgress(){
        if (progress.doubleValue() < 1){
            progress = new BigDecimal(String.format("%.2f",progress.doubleValue() + 0.1));
            myProgressBar.setProgress(progress.doubleValue());

            myLabel.setText(((int)(progress.doubleValue() * 100))+ "%");
            System.out.println(progress);
        }
    }
}