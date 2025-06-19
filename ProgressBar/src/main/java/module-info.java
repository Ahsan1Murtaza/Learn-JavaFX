module org.example.progressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.progressbar to javafx.fxml;
    exports org.example.progressbar;
}