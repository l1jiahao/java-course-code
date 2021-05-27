package argon.code.ch06.atm.controller;

import argon.code.ch06.atm.entity.ATM;
import argon.code.ch06.atm.entity.Account;
import argon.code.ch06.atm.stageutils.StageUtils;
import argon.code.ch06.atm.view.DialogOutput;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Register {
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
    private PasswordField registerPassword;
    @FXML
    private AnchorPane registerPane;
    @FXML
    public void initialize(){
        genderBox.getItems().addAll("女","男");
        creditBox.getItems().addAll("校园卡","身份证","暗号");
    }
    @FXML//下拉菜单选择性别
    private void getGender(){
        if (genderBox.getValue()!=null && genderBox.getValue().equals("女"))
            gender=true;
    }
    @FXML //输入证件号方便找回密码
    void getCredit(){
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
    private void getID(){
        ID=registerID.getText();
        registerID.clear();
    }
    @FXML
    private void getName(){
        Name=registerName.getText();
        registerName.clear();
    }
    @FXML
    private void getPassword(){
        Password=registerPassword.getText();
        registerPassword.clear();
    }
    @FXML
    private void confirm(){
        getGender();
        getID();
        getName();
        getPassword();
        credit=registerCredit.getText();
        registerCredit.clear();
        ATM.getInstance().register(ID,Name,gender,Password,credit);
        DialogOutput.outputInfo("恭喜你","注册成功","完成");
        StageUtils.getInstance().getStages().get("Register").close();
        StageUtils.getInstance().getStages().get("Login").show();

    }

}
