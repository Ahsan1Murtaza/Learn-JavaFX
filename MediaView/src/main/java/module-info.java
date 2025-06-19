module org.example.mediaview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens org.example.mediaview to javafx.fxml;
    exports org.example.mediaview;
}