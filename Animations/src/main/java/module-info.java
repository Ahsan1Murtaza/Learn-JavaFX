module org.example.animations {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.animations to javafx.fxml;
    exports org.example.animations;
}