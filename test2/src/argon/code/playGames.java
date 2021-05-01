package argon.code;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.Random;

public class playGames extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("剪刀石头布");
        dialog.setHeaderText("0=剪刀 1=石头 2=布");
        dialog.setContentText("输入你的选择");
        Optional<String> input = dialog.showAndWait();

        int player =Integer.valueOf(input.get());
        int computer= (int)(Math.random()*3); //给电脑一个3以内的随机数
        String computerChoose=switch (computer){ //判断出电脑出的是那种
            case 0->"剪刀";
            case 1->"石头";
            case 2->"布";
            default ->"Error";
        };
        String result=switch (player-computer){ //判断输赢
            case 0->"平局";
            case 1,-2->"你赢了！";
            case -1,2->"你输了";
            default -> "Error";
        };

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("结果");
        alert.setHeaderText("电脑出的是"+computerChoose);
        alert.setContentText(result);
        alert.showAndWait();

    }
}
