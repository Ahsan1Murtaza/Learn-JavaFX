module org.example.datepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.datepicker to javafx.fxml;
    exports org.example.datepicker;
}