module ch06 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens argon.code.ch06.atm.view;
    opens argon.code.ch06.atm.controller;
    opens argon.code.ch06.atm;
    opens argon.code.ch06.shapefamily.view;
    opens argon.code.ch06.shapefamily.controller;
    opens argon.code.ch06.shapefamily;

    exports argon.code.ch06.atm.controller;
    exports argon.code.ch06.atm;
    exports argon.code.ch06.shapefamily.view;
    exports argon.code.ch06.shapefamily.controller;
    exports argon.code.ch06.shapefamily;
}