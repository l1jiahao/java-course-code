package cn.edu.ncu.ljh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      BorderPane root = FXMLLoader.load(getClass().getResource("view/main.fxml"));
      var s = new Scene(root,300,300);
      primaryStage.setTitle("hll");
      primaryStage.setScene(s);
      primaryStage.show();
    }
}
