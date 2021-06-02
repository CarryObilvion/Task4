package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class Library extends Shape {

    public String getModuleName() {
        return "Библиотека";
    }
    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeRect(pointX-100,pointY-50,200,100);
        gc.strokeLine(pointX-100,pointY+20-50,pointX+100,pointY+20-50);
        gc.strokeLine(pointX-100,pointY+80-50,pointX+100,pointY+80-50);
        gc.fillText("Библиотека", pointX,  pointY);
    }
}
