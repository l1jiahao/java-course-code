package argon.code.ch06.atm.controller;

import argon.code.ch06.atm.entity.ATM;
import argon.code.ch06.atm.entity.Account;
import argon.code.ch06.atm.stageutils.StageUtils;
import argon.code.ch06.atm.view.DialogOutput;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Alert {
    private String ID;
    private String Name;
    private String Password;
    private boolean gender;
    private String credit;
    @FXML
    private ComboBox genderBox;
    @FXML
    private TextField registerID;
    @FXML
    private TextField registerName;
    @FXML
    private TextField registerCredit;
    @FXML
    private ComboBox creditBox;
    @FXML
    private Button registerConfirm;
    @FXML
    private Button exitBtn;
    @FXML
    private PasswordField registerPassword;
    @FXML
    private AnchorPane registerPane;
    @FXML
    public void initialize(){
        genderBox.getItems().addAll("女","男");
        creditBox.getItems().addAll("校园卡","身份证","暗号");
    }
    @FXML void getCredit(){
        switch ((String) creditBox.getValue()){
            case "校园卡"->registerCredit.setPromptText("请输入11位校园卡号");
            case "身份证"->registerCredit.setPromptText("请输入18位身份证号码");
            case "暗号"->registerCredit.setPromptText("来个暗号");
            default -> {
                break;
            }
        }
    }
    @FXML
    private void getName(){
        Name=registerName.getText();
    }
    @FXML
    private void getPassword(){
        Password=registerPassword.getText();
    }
    @FXML
    private void confirm(){
        Account account=ATM.getInstance().getCurrentaccount();
        account.setCredit(registerCredit.getText());
        account.setPassword(Password);
        DialogOutput.outputInfo("恭喜你","修改成功","完成");
        exit();
    }
    @FXML
    private void exit(){
        StageUtils.getInstance().getStages().get("Alter").close();
        StageUtils.getInstance().getStages().get("LoginIn").show();
    }
}
