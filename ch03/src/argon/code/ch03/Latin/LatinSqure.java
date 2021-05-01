package argon.code.ch03.Latin;

import argon.code.ch03.Latin.view.LatinPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LatinSqure extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var root=new LatinPane();
        var scene=new Scene(root,500,800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("拉丁方阵");
        primaryStage.show();
    }
}
