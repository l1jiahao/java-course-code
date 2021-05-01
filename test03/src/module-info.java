module test03 {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;

    opens cn.edu.ncu.ljh.view;
    opens cn.edu.ncu.ljh;

    exports cn.edu.ncu.ljh.view;
    exports cn.edu.ncu.ljh;
}