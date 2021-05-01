package argon.code.ch06.shapefamily.view;

import argon.code.ch06.shapefamily.entity.Shapable;
import argon.code.ch06.shapefamily.utils.SourceHander;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class DrawPane extends Pane {
    private Canvas canvas;
    private GraphicsContext gc;
    private Shapable shape;
    public DrawPane() throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        canvas=new Canvas(800,600);
        gc= canvas.getGraphicsContext2D();
        shape=SourceHander.getinstance().getClasses();

        draw();
        drawInfo();

        getChildren().add(canvas);
    }
    public void draw() throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        gc.clearRect(0,0,800,600);
        shape.draw(gc);
    }
    public void drawInfo(){
        gc.setStroke(Color.BLACK);
        gc.strokeText("周长： "+String.valueOf(shape.getLength()),700,20);
        gc.strokeText("面积： "+String.valueOf(shape.getArea()),700,40);

    }
    public GraphicsContext getGc() {
        return gc;
    }
}
