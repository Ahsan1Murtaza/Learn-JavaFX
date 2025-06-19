module org.example.listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.listview to javafx.fxml;
    exports org.example.listview;
}