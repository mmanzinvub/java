package org.example.demoapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    private String name;

    Singleton singleton = Singleton.getInstance();
    @FXML
    private Circle circle;

    @FXML
    Label nameLabel;
    @FXML
    private Button downButton;
    @FXML
    private Button leftButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button rightButton;
    @FXML
    private Button upButton;
        public void initialize() {

            nameLabel.setText(singleton.getName());
        }
    public void moveCircleUp(){
        circle.setCenterY(circle.getCenterY() - 5);
    }
    public void moveCircleDown(){
        circle.setCenterY(circle.getCenterY() + 5);
    }
    public void moveCircleLeft(){
        circle.setCenterX(circle.getCenterX() - 5);
    }
    public void moveCircleRight(){
        circle.setCenterX(circle.getCenterX() +5);
    }

    public void switchToNextScene(){
        SceneManager.switchTo("bookTable");
    }

}
