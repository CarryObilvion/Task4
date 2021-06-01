package sample.Methods;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape implements Cloneable{
    public String type;
    public abstract String getModuleName();
    public abstract void draw(GraphicsContext gc, Double pointX, Double pointY);
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    @Override
    public String toString() {
        return getModuleName();
    }
}