package argon.code.ch06.atm.view;

import javafx.scene.control.*;

import java.util.Optional;

public class DialogOutput {
    public static String inputInfo(String title,String content){
        var dialog=new TextInputDialog();
        dialog.setTitle(title);
        dialog.setContentText(content);
        Optional<String> result=dialog.showAndWait();
        return result.get();
    }
    public static void outputInfo(String title,String header,String button){
        var alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        var buttons=new ButtonType(button);
        alert.getButtonTypes().setAll(buttons);
        alert.showAndWait();
    }
}
