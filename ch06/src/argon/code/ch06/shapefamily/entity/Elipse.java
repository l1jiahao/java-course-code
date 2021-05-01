package argon.code.ch06.shapefamily.entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Elipse implements Shapable{
    private double x;
    private double y;
    private double width;//表示底边长
    private double length;//用来表示高
    private Color color;

    public Elipse(double x, double y, double width, double length, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    @Override
    public double getArea() {
        return this.width*this.length/2;
    }

    @Override
    public double getLength() {
        double xiebian=Math.sqrt(Math.pow(this.length,2)+Math.pow(this.width/2,2));
        return xiebian*2+width;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(this.color);
        gc.fillOval(this.x,this.y,this.width,this.length);
    }
}
