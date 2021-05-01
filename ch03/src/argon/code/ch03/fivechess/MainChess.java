package argon.code.ch03.fivechess;

import argon.code.ch03.fivechess.view.ChessPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainChess extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
      BorderPane root= FXMLLoader.load(getClass().getResource("view/Test.fxml"));
        //var root =new ChessPane();
        var scene=new Scene(root,820,850);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("argon/code/ch03/fivechess/argon.jpg"));//给stage加上图片
        primaryStage.setTitle("ArGon-五子棋ver3.0");
        primaryStage.show();
    }
}
