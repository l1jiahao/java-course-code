package exercise.Calendar;

import exercise.Calendar.view.CalendarPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalendarMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var root=new CalendarPane();
        var scene=new Scene(root,800,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("2021年日历");
        primaryStage.show();
    }
}
