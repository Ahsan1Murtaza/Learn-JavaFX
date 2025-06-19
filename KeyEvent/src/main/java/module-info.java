module org.example.keyevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.keyevent to javafx.fxml;
    exports org.example.keyevent;
}