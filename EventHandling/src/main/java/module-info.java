module org.example.eventhandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.eventhandling to javafx.fxml;
    exports org.example.eventhandling;
}