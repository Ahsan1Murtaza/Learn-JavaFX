module org.example.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.scenebuilder to javafx.fxml;
    exports org.example.scenebuilder;
}