module org.example.gridpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gridpane to javafx.fxml;
    exports org.example.gridpane;
}