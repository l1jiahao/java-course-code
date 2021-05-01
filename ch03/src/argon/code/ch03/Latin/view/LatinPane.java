package argon.code.ch03.Latin.view;

import argon.code.ch03.Latin.entity.LatinRule;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import java.awt.*;

public class LatinPane extends Pane {
    private LatinRule latin;
    private int width=800,height=800;
    private int cell=80;
    private int cellH=120;
    private int StartX=10,Starty=10;
    private Canvas canvas;
    private GraphicsContext gc;
    public LatinPane(){
        latin=new LatinRule();
        canvas=new Canvas(width,height);
        gc=canvas.getGraphicsContext2D();
        getChildren().add(canvas);
        draw();
    }
    public void draw(){
        drawPane();
        drawFigure();
        drawValue();
    }
    public void drawPane(){
        for (int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                gc.strokeRect(StartX+i*cell,Starty+j*cellH,cell,cellH);
                switch (latin.getFigure()[latin.generateFigure()[i*6+j]]){//根据花色选择打印背景颜色
                    case "♥"->gc.setFill(Color.RED);
                    case "♠"->gc.setFill(Color.GREEN);
                    case "♦"->gc.setFill(Color.WHITE);
                    case "♣"->gc.setFill(Color.VIOLET);
                    default ->gc.setFill(Color.GOLD);
                }
                gc.fillRect(StartX+i*cell,Starty+j*cellH,cell,cellH);
            }
        }
    }
    public void drawFigure(){
        for (int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                gc.strokeText(latin.getFigure()[latin.generateFigure()[i*6+j]],StartX+i*cell+70,Starty+j*cellH+120);
                gc.strokeText(latin.getFigure()[latin.generateFigure()[i*6+j]],StartX+i*cell+5,Starty+j*cellH+10);
            }//调整对角的花色位置
        }
    }
    public void drawValue(){
        for (int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                gc.strokeText(latin.getValue()[latin.generateValue()[i*6+j]],StartX+i*cell+60,Starty+j*cellH+120);
                gc.strokeText(latin.getValue()[latin.generateValue()[i*6+j]],StartX+i*cell+15,Starty+j*cellH+10);
            }//调整对角的数字位置
        }
    }
}
