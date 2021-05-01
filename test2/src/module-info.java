module test2 {
    requires javafx.graphics;

    requires javafx.controls;
    requires javafx.web;
    requires javafx.swing;
    requires javafx.media;
    requires javafx.fxml;
    requires javafx.swt;
    requires javafx.base;

    opens argon.code;

    exports argon.code;
}