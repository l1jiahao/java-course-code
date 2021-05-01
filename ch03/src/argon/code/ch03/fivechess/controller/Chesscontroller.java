package argon.code.ch03.fivechess.controller;

import argon.code.ch03.fivechess.entity.chessRull;
import argon.code.ch03.fivechess.view.ChessPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.util.Arrays;

public class Chesscontroller {
    @FXML
    private Button startBtn;
    @FXML
    private Button resetBtn;
    @FXML
    private ChessPane chessPane;
    @FXML
    private Label currentPlayer;
    @FXML
    public void startGame(){
        startBtn.setVisible(false);
        chessRull.getUniquechess().setName();
        currentPlayer.setVisible(true);
        resetBtn.setVisible(true);
        currentTip();
        chessPane.setVisible(true);
    }
    @FXML
    public void playChess(javafx.scene.input.MouseEvent event) {
        int x=(int)(event.getX()-chessRull.getUniquechess().getStartx())/chessRull.getUniquechess().getCell();
        int y=(int)(event.getY()-chessRull.getUniquechess().getStarty())/chessRull.getUniquechess().getCell();
        chessRull.getUniquechess().play(x,y);
        currentTip();
        chessPane.draw();
    }
    public Chesscontroller(){
        chessPane=new ChessPane();
    }
    @FXML
    public void reSet(){
        for (int i=0;i<20;i++){
            Arrays.fill(chessRull.getUniquechess().getChess()[i]," ");//如果选择了重置游戏则将字符串数组重置为初始状态
        }
        chessPane.draw();
    }
    @FXML
    public void currentTip(){
        String currentSide=chessRull.getUniquechess().getCurrentSide().equals("B")?chessRull.getUniquechess().getPalyer1() : chessRull.getUniquechess().getPlayer2();
        System.out.println(currentSide);
        currentPlayer.setText("现在是"+currentSide+"的回合");
    }
}
