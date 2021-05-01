package exercise.Calendar.view;

import exercise.Calendar.entity.Calendar;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CalendarPane extends Pane {
    private Canvas canvas;
    private GraphicsContext gc;
    private Calendar calendar;
    private int Width=800,Height=800;
    private int StartX=10,StartY=10;
    private int CellWidth=180,CellHeight=240;
    public CalendarPane(){
        canvas=new Canvas(Width,Height);
        gc=canvas.getGraphicsContext2D();
        calendar=new Calendar();
        getChildren().add(canvas);
        drawPane();
        drawCalendar();
    }
    private void draw(){

    }
    private void drawPane(){
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                gc.setFill(Color.BLACK);
                gc.setFill(Color.rgb(240,248,255));
                gc.strokeRect(StartX+j*CellWidth,StartY+i*CellHeight,CellWidth,CellHeight);
                gc.fillRect(StartX+j*CellWidth,StartY+i*CellHeight,CellWidth,CellHeight);
            }
        }
    }
    private void drawCalendar(){
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                gc.setStroke(Color.rgb(	255,99,71));
                gc.strokeText(calendar.getCalendarStr(2021,i*4+j+1),StartX+j*CellWidth+25,StartY+i*CellHeight+40);
            }
        }
    }
}
