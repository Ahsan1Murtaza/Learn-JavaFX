package org.example.animations;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.IndexRange;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Circle myCircle;

    @FXML
    private Rectangle myRectangle;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(myCircle);
        translateTransition.setDuration(Duration.millis(1000));
        translateTransition.setByX(500);
        translateTransition.setCycleCount(Animation.INDEFINITE);
        translateTransition.setAutoReverse(true);
        translateTransition.play();



        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(myRectangle);
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.setByAngle(360);
        rotateTransition.setInterpolator(Interpolator.LINEAR);// for constant animation
        rotateTransition.setAxis(Rotate.X_AXIS);
        rotateTransition.play();



        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setNode(myCircle);
        fadeTransition.setDuration(Duration.millis(1000));
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.setInterpolator(Interpolator.LINEAR);// for constant animation
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();



        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setNode(myCircle);
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setCycleCount(Animation.INDEFINITE);
        scaleTransition.setInterpolator(Interpolator.LINEAR);// for constant animation
        scaleTransition.setByX(2);
        scaleTransition.play();
    }
}