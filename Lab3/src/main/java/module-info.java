module com.example.lab3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.pdfbox;
    requires org.apache.pdfbox.io;


    opens com.example.lab3 to javafx.fxml;
    opens se233.chapter3.controller to javafx.fxml;
    exports com.example.lab3;
    exports se233.chapter3;
    exports se233.chapter3.controller;
}