module org.example.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.radiobutton to javafx.fxml;
    exports org.example.radiobutton;
}