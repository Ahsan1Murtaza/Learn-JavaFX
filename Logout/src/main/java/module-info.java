module org.example.logout {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.logout to javafx.fxml;
    exports org.example.logout;
}