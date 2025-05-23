package org.example.demoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        System.out.println();

        /// Učitajte prvu scenu
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 640);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        ///  Postavite stage u SceneManager
        SceneManager.setStage(stage);

        /// Registrirajte sve potrebne scene
        SceneManager.registerScene("hello-view", "/org/example/demoapp/hello-view.fxml");
        SceneManager.registerScene("login-screen", "/org/example/demoapp/login-screen.fxml");
        SceneManager.registerScene("bookTable", "/org/example/demoapp/book-table.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}