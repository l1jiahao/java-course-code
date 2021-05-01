module ch03 {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;
    requires javafx.swing;
    requires javafx.media;
    requires javafx.fxml;
    requires javafx.swt;
    requires javafx.base;

    opens argon.code.ch03;
    opens argon.code.ch03.fivechess.view;
    opens argon.code.ch03.fivechess;
    opens argon.code.ch03.Latin;
    opens argon.code.ch03.Latin.view;
    opens argon.code.ch03.fivechess.controller;

    exports argon.code.ch03;
    exports argon.code.ch03.fivechess.view;
    exports argon.code.ch03.fivechess;
    exports argon.code.ch03.Latin;
    exports argon.code.ch03.Latin.view;
    exports argon.code.ch03.fivechess.controller;

}