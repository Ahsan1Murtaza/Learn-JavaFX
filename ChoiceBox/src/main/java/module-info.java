module org.example.choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.choicebox to javafx.fxml;
    exports org.example.choicebox;
}