module org.example.drawing {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.drawing to javafx.fxml;
    exports org.example.drawing;
}