package argon.code.ch03.fivechess.entity;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

import java.util.Arrays;
import java.util.Optional;

public class chessRull {
    private static chessRull chessrule=null;
    private String[][] Chess;
    private String Palyer1,Player2;//提供给用户自定义玩家姓名
    private String CurrentSide="B";

    private int width=820,height=820;
    private int Startx=10,Starty=10;
    private int cell=40;

    public void setPalyer1(String palyer1) {
        Palyer1 = palyer1;
    }

    public void setPlayer2(String player2) {
        Player2 = player2;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getStartx() {
        return Startx;
    }

    public int getStarty() {
        return Starty;
    }

    public int getCell() {
        return cell;
    }

    public String getPalyer1() {
        return Palyer1;
    }

    public String getCurrentSide() {
        return CurrentSide;
    }

    public String getPlayer2() {
        return Player2;
    }

    public chessRull(){
        Chess=new String[20][20];
        for (int i=0;i<20;i++){
            Arrays.fill(Chess[i]," ");
        }
    }
    public static chessRull getUniquechess(){
        if(chessrule==null) chessrule=new chessRull();
        return chessrule;
    }
    public void play(int row,int col){
        if(row<0) row=0;
        if (col<0) col=0;
        System.out.println(row+" "+col);
            if(rightPlace(row,col)){
                Chess[row][col]=CurrentSide;
                if(judgeGame(row,col)){
                    String winner=CurrentSide.equals("B")?Palyer1:Player2;//判断哪方获胜
                    showDialog("结果",winner+"赢了");
                    resetGame();//用户通过对话框选择是否重置游戏
                }else {
                    changeSide();
                }
            }
            else {
                showDialog("警告", "该位置已经被占用");
            }
    }

    public String[][] getChess() {
        return Chess;
    }

    public boolean rightPlace(int row, int col){
        return Chess[row][col].equals(" ");
    }//判断位置是否合法
    public boolean judgeGame(int row,int col){//判断输赢
        return isCol(row, col) || isLine(row, col) || isNLine(row, col) || isRow(row, col);
    }
    public boolean isRow(int row,int col){
        int count=0;
        for (int i=1;i<=4;i++){//对该行的前后四个元素进行扫描看是否有五个连在一起的元素
            if(col-i>=0 && Chess[row][col-i].equals(CurrentSide)){
                count++;
            }else break;//只要中间有一个对手的棋子则改变方向 不在计数
        }
        for (int j=1;j<=4;j++){
            if (col+j<Chess[col].length && Chess[row][col+j].equals(CurrentSide)){
                count++;
            }else break;//对另一边进行同样的操作
        }
        return count >= 4;
    }
    public boolean isCol(int row,int col){
        int count=0;
        for (int i=1;i<=4;i++){
            if(row-i>=0 && Chess[row-i][col].equals(CurrentSide)){
                count++;
            }else break;
        }
        for (int j=1;j<=4;j++){
            if (row+j<Chess[row].length && Chess[row+j][col].equals(CurrentSide)){
                count++;
            }else break;
        }
        return count >= 4;
    }
    public boolean isLine(int row,int col){
        int count=0;
        for (int i=1;i<=4;i++){
            if(row-i>=0 && col-i>=0 && Chess[row-i][col-i].equals(CurrentSide)){
                count++;
            }else break;
        }
        for (int j=1;j<=4;j++){
            if (row+j<Chess[row].length  && col+j<Chess[col].length&&Chess[row+j][col+j].equals(CurrentSide)){
                count++;
            }else break;
        }
        return count >= 4;
    }
    public boolean isNLine(int row,int col){
        int count=0;
        for (int i=1;i<=4;i++){
            if(row-i>=0 && col+i<Chess[col].length && Chess[row-i][col+i].equals(CurrentSide)){
                count++;
            }else break;
        }
        for (int j=1;j<=4;j++){
            if (row+j<Chess[row].length && col-j>=0 && Chess[row+j][col-j].equals(CurrentSide)){
                count++;
            }else break;
        }
        return count >= 4;
    }
    public void changeSide(){
        CurrentSide=(CurrentSide.equals("B")?"W":"B");
    }//判断现在的玩家 来切换黑白子
   public void showDialog(String title,String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);//简单的提示信息框
        alert.setTitle(title);
        alert.setContentText(content);
       ButtonType buttonTypeCancel = new ButtonType("知道了", ButtonBar.ButtonData.CANCEL_CLOSE);//加一个知道了按钮
       alert.getButtonTypes().setAll( buttonTypeCancel);
       alert.showAndWait();
    }
    public void resetGame(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("下一步是");
        alert.setContentText("再来一局嘛(ง •_•)ง");
        var button1=new ButtonType("淦");
        var button2=new ButtonType("溜了",ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(button1,button2);
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);//不知道如何调用stage的关闭方法令其关闭
        alert2.setTitle("别看了");
        alert2.setHeaderText("现在还关不掉(￣▽￣)");
        var button3=new ButtonType("自己关");
        Optional<ButtonType> result=alert.showAndWait();
        alert2.getButtonTypes().setAll(button3);
        if(result.get()==button1){
            for (int i=0;i<20;i++){
                Arrays.fill(Chess[i]," ");//如果选择了重置游戏则将字符串数组重置为初始状态
            }

        }else if(result.get()==button2){
            alert2.showAndWait();
        }

    }
    public void setName(){//定义玩家姓名
        var dialog=new TextInputDialog();
        dialog.setTitle("取个ID");
        dialog.setHeaderText("想个怪名字(*￣3￣)╭");
        dialog.setContentText("");

        var dialog2=new TextInputDialog();
        dialog2.setTitle("抬走下一个");
        dialog2.setHeaderText("君の名は。");
        dialog2.setContentText("Kono");

        Optional<String >result=dialog.showAndWait();
        Optional<String>result2=dialog2.showAndWait();
        Palyer1=result.get();
        Player2=result2.get();

    }

}
