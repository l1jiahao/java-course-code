package argon.code;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class autoPrint extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("打印图形");
        dialog.setHeaderText("输入构成图形所用的字符");
        Optional<String> input = dialog.showAndWait();

        String value = input.get();
        String content= """
                 jj           jj      jj      jj      jj 
                 jj         jj  jj     jj    jj    jj  jj
            jj  jj       jj  jj jj     jj jj    jj jj jj
              jjjj       jj       jj      jj     jj      jj
                """;
        content=content.replaceAll("jj",value);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("结果");
        alert.setHeaderText("输出");
        alert.setContentText(content);
        alert.showAndWait();

    }
}
