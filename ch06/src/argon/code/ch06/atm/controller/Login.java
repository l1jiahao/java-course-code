package argon.code.ch06.atm.controller;

import argon.code.ch06.atm.entity.ATM;
import argon.code.ch06.atm.entity.Account;
import argon.code.ch06.atm.stageutils.StageUtils;
import argon.code.ch06.atm.view.DialogOutput;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {
    @FXML
    private AnchorPane pane;
    @FXML
    private Text forgetPassword;
    @FXML
    private TextField loginID;
    @FXML
    private TextField loginPassword;
    @FXML
    private Button loginBtn;
    @FXML
    private Button registerBtn;
    @FXML
    private void loginIn()throws Exception{
        var atm=ATM.getInstance();
        if (atm.checkAccount(loginID.getText(),loginPassword.getText())){
            StageUtils.getInstance().getStages().get("Login").close();
            AnchorPane root= FXMLLoader.load(getClass().getResource("atmsystem.fxml"));
            var scene=new Scene(root,600,400);
            var stage=new Stage();
            stage.setScene(scene);
            stage.getIcons().add(new Image("argon/code/ch06/atm/argon.jpg"));
            stage.setTitle("ArGon-ATM系统");
            stage.show();
            StageUtils.getInstance().getStages().put("LoginIn",stage);
        }else DialogOutput.outputInfo("抱歉","账号或者用户名错误","知道了");
    }
    @FXML
    private void register()throws Exception{
        StageUtils.stageUtils.getStages().get("Login").close();
        AnchorPane root= FXMLLoader.load(getClass().getResource("regsister.fxml"));
        var scene=new Scene(root,600,400);
        var stage=new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("argon/code/ch06/atm/argon.jpg"));
        stage.setTitle("ArGon-注册系统");
        stage.show();
        StageUtils.getInstance().getStages().put("Register",stage);
    }
    @FXML
    private void forget(){
        boolean find=false;
        String inputcredit= DialogOutput.inputInfo("找回密码","请输入预留的证件号");
        for (Account account:ATM.getInstance().getAccounts()){
            if(account.getCredit()!=null && account.getCredit().equals(inputcredit)){
                DialogOutput.outputInfo("您的密码是",account.getPassword(),"知道了");
                find=true;
                break;
            }
        }
        if (!find){
            DialogOutput.outputInfo("抱歉","您输入的证件号有误","确认");
        }
    }

}
