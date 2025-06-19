module org.example.slider {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.slider to javafx.fxml;
    exports org.example.slider;
}