module com.example.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.game to javafx.fxml;
    exports com.example.game;
    exports se233.chapter1;
    exports se233.chapter1.model.character;
    exports se233.chapter1.model.item;
    exports se233.chapter1.view;
    exports se233.chapter1.controller;
}