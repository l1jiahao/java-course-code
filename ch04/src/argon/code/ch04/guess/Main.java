package argon.code.ch04.guess;

import argon.code.ch04.guess.entity.guessRule;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root=  FXMLLoader.load(getClass().getResource("view/guessGui.fxml"));//此处需要AnchorPane类型
        var scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("argon/code/ch04/guess/argon2.jpg"));
        primaryStage.setTitle("ArGon-猜单词—Ver3.0");
        primaryStage.show();
    }
}
