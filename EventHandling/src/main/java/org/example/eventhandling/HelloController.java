package org.example.eventhandling;


import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
public class HelloController {
    @FXML
    private Circle myCircle;
    double x;
    double y;

    public void Up(){
        myCircle.setCenterY(y-=10);
//        System.out.println("Up");
    }
    public void Down(){
        myCircle.setCenterY(y+=10);
//        System.out.println("Down");
    }
    public void Right(){
        myCircle.setCenterX(x+=10);
//        System.out.println("Right");
    }
    public void Left(){
        myCircle.setCenterX(x-=10);
//        System.out.println("Left");
    }
}