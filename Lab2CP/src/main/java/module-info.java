module com.example.lab2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.io;
    requires org.json;
    requires java.naming;
    requires java.desktop;


    opens com.example.lab2 to javafx.fxml;
    exports com.example.lab2;
    exports se233.chapter2;
}
