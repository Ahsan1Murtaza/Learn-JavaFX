module org.example.switchscene {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.switchscene to javafx.fxml;
    exports org.example.switchscene;
}