module ch04 {
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.media;
    requires  javafx.controls;
    requires javafx.swt;

    opens argon.code.ch04.guess.view;
    opens argon.code.ch04.guess.controller;
    opens argon.code.ch04.guess;
    opens exercise.Calendar.view;
    opens exercise.Calendar;

    exports argon.code.ch04.guess.controller;
    exports argon.code.ch04.guess;
    exports exercise.Calendar.view;
    exports exercise.Calendar;
}