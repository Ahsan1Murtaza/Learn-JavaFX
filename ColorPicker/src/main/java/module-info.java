module org.example.colorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.colorpicker to javafx.fxml;
    exports org.example.colorpicker;
}