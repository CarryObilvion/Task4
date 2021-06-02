package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class Subsystem extends Shape {

    public String getModuleName() {
        return "Подсистема";
    }
    @Override
    public void draw(GraphicsContext gc, Double pointX, Double pointY) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeRect(pointX-100,pointY-50,200,100);
        gc.strokeLine(pointX+30-100,pointY-50,pointX+30-100,pointY+100-50);
        gc.strokeLine(pointX+200 - 30-100,pointY-50,pointX+200 - 30-100,pointY+100-50);
        gc.fillText("Подсистема", pointX,  pointY);
    }
}
