package argon.code;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class testApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("输入：");
        dialog.setHeaderText("输入的数据");
        dialog.setContentText("输入年份");
        Optional<String> input = dialog.showAndWait();

        String value = input.get();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("操作");
        alert.setHeaderText("输出");
        alert.setContentText(value);
        alert.showAndWait();

    }
}
