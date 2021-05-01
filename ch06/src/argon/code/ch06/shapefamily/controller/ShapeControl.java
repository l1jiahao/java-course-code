package argon.code.ch06.shapefamily.controller;

import argon.code.ch06.shapefamily.utils.SourceHander;
import argon.code.ch06.shapefamily.view.DrawPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShapeControl implements Initializable {
    @FXML
    private DrawPane drawpane;
    @FXML
    private Button drawBtn;
    @FXML
    private TextField xInput;
    @FXML
    private TextField yInput;
    @FXML
    private TextField wInput;
    @FXML
    private TextField lInput;
    @FXML
    private TextField cInput;
    @FXML
    private ComboBox Shapebox;
    public ShapeControl() throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        drawpane=new DrawPane();
    }
    @FXML
    public void draw() throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        setParam();
        drawpane=new DrawPane();
        System.out.println("画");
    }
    @FXML
    public String getShape(){
        return switch ((String)Shapebox.getValue()){
            case "Rect"->"Rectangle";
            case "Elipse"->"Elipse";
            default -> throw new IllegalStateException("Unexpected value: " + (String) Shapebox.getValue());
        };
    }
    @FXML
    public void setParam() throws IOException {
        System.out.println(getShape());
        SourceHander.getinstance().setProperties(getShape(),xInput.getText(), yInput.getText(), wInput.getText(), lInput.getText(), cInput.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Shapebox.getItems().addAll("Rect","Elipse");
    }
}
