module org.example.flowpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.flowpane to javafx.fxml;
    exports org.example.flowpane;
}