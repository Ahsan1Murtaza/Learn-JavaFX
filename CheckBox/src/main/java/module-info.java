module org.example.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.checkbox to javafx.fxml;
    exports org.example.checkbox;
}