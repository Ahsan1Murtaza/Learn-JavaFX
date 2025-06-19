package org.example.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HelloController {
    @FXML
    Label myLabel;

    @FXML
    DatePicker datePicker;

    public void getDate(ActionEvent event){
        LocalDate date = datePicker.getValue();
        String dateFormat = date.format(DateTimeFormatter.ofPattern("MMM-yyyy-dd"));

        myLabel.setText(dateFormat);
    }

}