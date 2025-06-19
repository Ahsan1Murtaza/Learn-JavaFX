module org.example.treeview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.treeview to javafx.fxml;
    exports org.example.treeview;
}