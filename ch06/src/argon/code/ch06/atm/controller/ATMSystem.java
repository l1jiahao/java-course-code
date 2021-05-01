package argon.code.ch06.atm.controller;

import argon.code.ch06.atm.entity.ATM;
import argon.code.ch06.atm.entity.Account;
import argon.code.ch06.atm.view.DialogOutput;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ATMSystem {
    @FXML
    private Button depositBtn;
    @FXML
    private Button drawBtn;
    @FXML
    private Button transferBtn;
    @FXML
    private Label outPutInfo;
    @FXML
    private void deposit(){
        double money;
        System.out.println(ATM.getInstance().getCurrentaccount());
        money=Double.valueOf(DialogOutput.inputInfo("存款","请输入存款金额"));
        ATM.getInstance().depositMoney(money);
        outPutInfo.setText(ATM.getInstance().getCurrentaccount().toString());
    }
    @FXML
    private void draw(){
        double money;
        System.out.println(ATM.getInstance().getCurrentaccount());
        money=Double.valueOf(DialogOutput.inputInfo("取款","请输入取款金额"));
        if(ATM.getInstance().drawMoney(money)) {
            outPutInfo.setText(ATM.getInstance().getCurrentaccount().toString());
        }else DialogOutput.outputInfo("抱歉","余额不足","确定");
    }
    @FXML
    private void transfer(){
        int flag=0;//判断是否找到了用户
        String targetid=DialogOutput.inputInfo("转账","请输入对方账号");
        for (Account account:ATM.getInstance().getAccounts()){
            if(account.getID().equals(targetid)){
                double money=Double.valueOf(DialogOutput.inputInfo("转账","请输入转账金额"));
                if(ATM.getInstance().transferMoney(account,money)){
                    flag++;
                }else {
                    DialogOutput.outputInfo("抱歉","余额不足","知道了");
                    break;
                };
            }
        }
        if(flag==0)
            DialogOutput.outputInfo("抱歉", "没有找到该用户", "知道了");
        outPutInfo.setText(ATM.getInstance().getCurrentaccount().toString());
        }
    @FXML
    private void alert()throws Exception{
        AnchorPane root= FXMLLoader.load(getClass().getResource("alert.fxml"));
        var scene=new Scene(root,600,400);
        var stage=new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image("argon/code/ch06/atm/argon.jpg"));
        stage.setTitle("ArGon-修改系统");
        stage.show();

    }
/*    @FXML
    private void alert()throws Exception{
        AnchorPane root= FXMLLoader.load(getClass().getResource("alert.fxml"));
        var scene=new Scene(root,600,400);
        var stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("ArGon-修改系统");
        stage.show();

    }*/
    @FXML
    private void tradeHistory(){
        outPutInfo.setText(ATM.getInstance().getCurrentaccount().getHistory().toString());
    }
}



