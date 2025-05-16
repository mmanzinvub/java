package com.example.lv10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(DemoApp.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 640);
        stage.setTitle("Demo app");
        stage.setScene(scene);
        stage.show();
        SceneManager.setStage(stage);
        SceneManager.registerScene("login", "/home/matko/IdeaProjects/LV10/src/main/resources/com/example/lv10/Login.fxml");
        //SceneManager.registerScene("bookTable", "/org/example/demoapp/book-table.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}