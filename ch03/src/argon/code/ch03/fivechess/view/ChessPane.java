package argon.code.ch03.fivechess.view;

import argon.code.ch03.fivechess.entity.chessRull;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class ChessPane extends Pane {

    private String[][] chessFigure;

    private int width,height;
    private int Startx,Starty;
    private int cell;

    private Canvas canvas;
    private GraphicsContext graphics;

    public ChessPane(){
        chessRull chess=chessRull.getUniquechess();

        width=chess.getWidth();
        height=chess.getHeight();
        Startx=chess.getStartx();
        Starty=chess.getStarty();
        cell=chess.getCell();

        canvas=new Canvas(width,height);
        graphics= canvas.getGraphicsContext2D();
        this.chessFigure=chess.getChess();

        draw();

        getChildren().add(canvas);//画画的操作都是在canvas上完成的 此处要将canvas导入到chesspane中

        //chess.setName();
/*        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                var x=(int)(mouseEvent.getX()-Startx)/cell;
                var y=(int)(mouseEvent.getY()-Starty)/cell;
                chess.play(x,y);
                draw();
            }
        });*/
    }
    public void draw(){
        graphics.clearRect(0,0,canvas.getHeight(),canvas.getWidth());//清除画布
        drawPane();
        drawChess();
    }

    public void drawPane(){
        graphics.setStroke(Color.BLACK);
        for (int i=0;i<chessFigure.length-1;i++){
            for (int j=0;j<chessFigure[i].length-1;j++){
                graphics.strokeRect(Startx+i*cell+20,Starty+j*cell+20,cell,cell);//画线框的时候将线框进行偏移就不必移动棋子
            }
        }
    }
    public void drawChess(){
        for (int i=0;i<chessFigure.length;i++){
            for (int j=0;j<chessFigure[i].length;j++){
                if(chessFigure[i][j].equals("B")) {
                    graphics.setStroke(Color.BLACK);
                    graphics.setFill(Color.BLACK);//画黑方棋子并且加上图片
                    graphics.fillOval(Startx + i * cell, Starty + j * cell, cell, cell);
                    graphics.drawImage(new Image("argon/code/ch03/fivechess/sword.png"),Startx + i * cell,Starty + j * cell,cell,cell-5);

                }else if(chessFigure[i][j].equals("W")){
                    graphics.setStroke(Color.GOLD);
                    graphics.setFill(Color.WHITE);
                    graphics.fillOval(Startx + i * cell, Starty + j * cell, cell, cell);
                    graphics.drawImage(new Image("argon/code/ch03/fivechess/resizeApi.png"),Startx + i * cell,Starty + j * cell,cell,cell-5);
                    graphics.strokeOval(Startx + i * cell, Starty + j * cell, cell, cell);
                }
            }
        }
    }
}
