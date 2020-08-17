package main;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UserController {

	@FXML
	private TextField inputUsername;
	
	@FXML
	private TextField inputPassword;	
	
	@FXML
	private Label inputError;
	
	public void signin() throws IOException {		
		if (UserAuthenticationService.checkUser(inputUsername.getText(), inputPassword.getText())) {
			LoginApp.switchToProfileScene(LoginApp.profilePage, inputUsername.getText());
		}
		else {
			inputError.setText("Wrong credentials");
		}
	}
	
	
	
}
