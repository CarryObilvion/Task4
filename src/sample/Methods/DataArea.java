package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class DataArea extends Shape {
    public String getModuleName() {
        return "Область данных";
    }

    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeOval(pointX-100, pointY-50, 200, 100);
        gc.fillText("Область данных", pointX,  pointY);
    }
}
