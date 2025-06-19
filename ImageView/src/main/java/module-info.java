module org.example.imageview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.imageview to javafx.fxml;
    exports org.example.imageview;
}