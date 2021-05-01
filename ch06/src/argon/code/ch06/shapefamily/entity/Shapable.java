package argon.code.ch06.shapefamily.entity;

import javafx.scene.canvas.GraphicsContext;

public interface Shapable {
    public double getArea();
    public double getLength();
    public void draw(GraphicsContext gc);
}
