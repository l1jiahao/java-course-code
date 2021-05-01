package argon.code;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class classifyScore extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("成绩分类");
        dialog.setHeaderText("输入学生的分数（0~100）");
        dialog.setContentText("分数");
        Optional<String> input = dialog.showAndWait();

        int value =Integer.valueOf(input.get()); //将输入的字符转换成数字
        scoreGrade grades=scoreGrade.NOTPASS;
        String content=grades.getlevel((value/10)-grades.getCode());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("结果");
        alert.setHeaderText("该学生属于");
        alert.setContentText(content);
        alert.showAndWait();

    }
}
