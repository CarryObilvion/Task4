package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import sample.Methods.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Canvas can;
    public ListView<Shape> listboxforfigure;
    public ObservableList<Shape> items;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Modulus module =new Modulus();
        Subsystem subsystem=new Subsystem();
        Library library=new Library();
        DataArea dataArea=new DataArea();
        items = FXCollections.observableArrayList(module, subsystem, library, dataArea);

        listboxforfigure.setItems(items);
        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void addShape(MouseEvent mouseEvent) {
        GraphicsContext gc = can.getGraphicsContext2D();
        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int index = listboxforfigure.getSelectionModel().getSelectedIndex();
        MultipleSelectionModel<Shape> textValue = listboxforfigure.getSelectionModel();
        if(index>=0) {
            Shape new_figure = (Shape) items.get(index).clone();
            gc.clearRect(0, 0, can.getWidth(), can.getHeight());
            new_figure.draw(gc, mouseEvent.getX(), mouseEvent.getY());
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введенный модуль не обнаружен");
            alert.showAndWait();

        }
    }

    public void cleanCan(ActionEvent actionEvent) {
        GraphicsContext gr = can.getGraphicsContext2D();
        gr.clearRect(0, 0, can.getWidth(),can.getHeight());
    }
}
