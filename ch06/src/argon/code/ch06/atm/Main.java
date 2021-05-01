package argon.code.ch06.atm;

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
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root= FXMLLoader.load(getClass().getResource("view/login.fxml"));
        var scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("argon/code/ch06/atm/argon.jpg"));
        primaryStage.setTitle("ArGon-ATM-Ver2.0");
        primaryStage.show();
    }
}
