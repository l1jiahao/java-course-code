package argon.code.ch06.shapefamily.entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle implements Shapable {
    private double x;
    private double y;
    private double width;
    private double length;
    private Color color;

    public Rectangle(double x, double y, double width, double length, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
        this.color = color;
    }
    public Rectangle(){
        this(0,0,20,20,Color.BLUE);
    }
    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getLength() {
        return 2*(this.width+this.length);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(this.color);
        gc.fillRect(this.x,this.y,this.width,this.length);
    }
    
}
