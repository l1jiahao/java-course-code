package argon.code.ch04.guess.controller;

import argon.code.ch04.guess.entity.guessRule;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

public class guessControl implements Initializable {
    private String puzzleContent;
    private int totalCount;
    private int winCount;
    private guessRule guessrule;//这里声明一个 属于guessRule类的实体对象guessrule
    @FXML
    private TextField inputWord;
    @FXML
    private Label labelTxt;
    @FXML
    private Button guessButton;
    @FXML
    private Label scoreLabel;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        labelTxt.setContentDisplay(ContentDisplay.CENTER);
        labelTxt.setText(guessrule.showPuzzle());
    }
    @FXML
    public void guess(){
        guessrule.setTotalCount(guessrule.getTotalCount()+1);
        if(inputWord.getText().equals(guessrule.getPuzzlecontent())){
            isRight();
        }else {
            guessButton.setTextFill(Color.RED);//按钮变红提示用户出错
            falseNotice();//给出错误提示
        }
        inputWord.clear();//清除输入框的文本 便于操作
        scoreLabel.setText(guessrule.winRate());//显示答题的详情信息 胜率
    }

    public guessControl(){//构造方法
        guessrule=new guessRule();//这里是初始化一个新的guesrule对象
    }

    /*
    * 监听键盘 利用回车键来确认
    * */
    @FXML
    public void guessBykey(KeyEvent evt){
        if(evt.getCode()==KeyCode.ENTER) guess();
    }

    @FXML
    public void changePuzzle(){//此处可以利用Skip按钮的onAction 直接切换题目
        guessrule.selcetPuzzle();
        labelTxt.setText(guessrule.showPuzzle());
    }

    @FXML
    public void isRight(){
        labelTxt.setText(guessrule.getPuzzlecontent()+"  Bingo!");//显示正确答案
        guessrule.setWinCount(guessrule.getWinCount()+1);
        rightNotice();//给出正确的提示 弹出提示框
        changePuzzle();
        guessButton.setTextFill(Color.BLACK);
    }
    public void rightNotice(){
        var alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("恭喜你！");
        alert.setHeaderText("下一个");
        var botton=new ButtonType("好的", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(botton);
        alert.showAndWait();
    }

    public void falseNotice(){
        var alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("抱歉");
        alert.setHeaderText("猜错了");
        var button1=new ButtonType("继续猜", ButtonBar.ButtonData.CANCEL_CLOSE);
        var button2=new ButtonType("换一个", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(button1,button2);
        Optional<ButtonType> result=alert.showAndWait();
        if (result.get()==button2) changePuzzle();

    }


}
