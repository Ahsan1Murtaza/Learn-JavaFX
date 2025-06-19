package org.example.drawing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
        stage.setTitle("Drawing");

        Text text = new Text();
        text.setText("Java fx");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.BLACK);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(300);
        line.setEndY(300);
        line.setStrokeWidth(10);
        line.setStroke(Color.BROWN);
//        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.RED);
        rectangle.setStrokeWidth(10);


        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300.0,300.0,
                400.0,400.0,
                300.0,400.0
        );
        triangle.setFill(Color.YELLOW);
        triangle.setStroke(Color.PURPLE);
        triangle.setStrokeWidth(10);


        Circle circle = new Circle();
        circle.setCenterX(450);
        circle.setCenterY(450);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);


        Image image = new Image("img.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(300);
        imageView.setY(100);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}