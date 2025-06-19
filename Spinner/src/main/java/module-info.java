module org.example.spinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.spinner to javafx.fxml;
    exports org.example.spinner;
}