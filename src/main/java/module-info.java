module org.example.calculadorafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.calculadorafx to javafx.fxml;
    exports org.example.calculadorafx;

    opens org.example.calculadorafx.controller to javafx.fxml;
    exports org.example.calculadorafx.controller;
}