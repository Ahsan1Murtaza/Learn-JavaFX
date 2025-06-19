module org.example.textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.textfield to javafx.fxml;
    exports org.example.textfield;
}