package org.example.listview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    Label myLabel;

    @FXML
    ListView<String> myListView;

    String currentFood;

    String[] foods = {"Sushi", "Pizza", "Ramen","Sushi", "Pizza", "Ramen","Sushi", "Pizza", "Ramen"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myListView.getItems().addAll(foods);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                currentFood = myListView.getSelectionModel().getSelectedItem();
                myLabel.setText(currentFood);
            }
        });
    }
}