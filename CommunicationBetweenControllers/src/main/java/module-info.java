module org.example.communicationbetweencontrollers {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.communicationbetweencontrollers to javafx.fxml;
    exports org.example.communicationbetweencontrollers;
}