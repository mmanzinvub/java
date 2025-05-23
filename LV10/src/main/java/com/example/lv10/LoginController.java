package com.example.lv10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Label wrongPass;

    @FXML
    private Label wrongUser;

    private final String VALID_USERNAME = "mmanzin";
    private final String VALID_PASSWORD = "1234";

    @FXML
    private void login() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (!username.equals(VALID_USERNAME) && !password.equals(VALID_PASSWORD)) {
            wrongUser.setVisible(true);
            wrongPass.setVisible(true);
        } else if (!username.equals(VALID_USERNAME)) {
            wrongUser.setVisible(true);
            wrongPass.setVisible(false);
        } else if (!password.equals(VALID_PASSWORD)) {
            wrongUser.setVisible(false);
            wrongPass.setVisible(true);
        } else {
            wrongUser.setVisible(false);
            wrongPass.setVisible(false);
            System.out.println("logged");
            SceneManager.switchTo("bookTable");
        }
    }
}
