module org.example.menu {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.menu to javafx.fxml;
    exports org.example.menu;
}