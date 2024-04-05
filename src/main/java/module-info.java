module com.example.demo11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ben.eGanou.application to javafx.fxml;
    exports ben.eGanou.application;
    exports controllers;
    opens controllers to javafx.fxml;
}