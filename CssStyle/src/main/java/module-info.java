module org.example.cssstyle {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cssstyle to javafx.fxml;
    exports org.example.cssstyle;
}