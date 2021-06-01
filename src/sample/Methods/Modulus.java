package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class Modulus extends Shape {

    public String getModuleName() {
        return "Модуль";
    }

    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.fillText("Модуль", pointX,  pointY);
        gc.strokeRect(pointX-100,pointY-50,200,100);
    }
}
