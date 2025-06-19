module org.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.hellofx to javafx.fxml;
    exports org.example.hellofx;
}