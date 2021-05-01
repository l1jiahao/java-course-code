package argon.code.ch06.shapefamily;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ShapeMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root= FXMLLoader.load(getClass().getResource("view/DrawShape2.fxml"));
        var scene=new Scene(root,800,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
