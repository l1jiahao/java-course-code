package cn.edu.ncu.ljh.view;

import cn.edu.ncu.ljh.entity.Lgoic;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class TestPane extends Pane {
    private Canvas canvas;
    private GraphicsContext gc;
    private Lgoic instance;
    public TestPane(){
        canvas = new Canvas(200,200);
        gc = canvas.getGraphicsContext2D();
        draw();
        instance = Lgoic.getInstance();
        getChildren().add(canvas);
    }

    public void draw(){
        gc.setFill(Color.BLUE);
        gc.fillText("Hello JavaFx",110,100);
    }
}
