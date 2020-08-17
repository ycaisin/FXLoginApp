package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application{

	static Scene signinForm;
	static Scene profilePage;
	public static Stage primaryStage;
	
	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		LoginApp.primaryStage = primaryStage;
		
		signinForm = new Scene(FXMLLoader.load(getClass().getResource("/signin-form.fxml")));
//		profilePage = new Scene(FXMLLoader.load(getClass().getResource("/profile-page.fxml"))); 
		
		switchScene(signinForm);
		
		//primaryStage.setScene(signinForm);
		
		primaryStage.show();
		
	}

	public static void switchScene(Scene scene) {
		primaryStage.setScene(scene);
	}
	
	public static void switchToProfileScene(Scene scene, String name) throws IOException {
		FXMLLoader loader = new FXMLLoader(LoginApp.class.getResource("/profile-page.fxml"));
	
		Parent root = loader.load();
		LoginApp.primaryStage.setScene(new Scene(root));
		UserProfileController userProfileController = loader.getController();
		userProfileController.setLabelName(name);
	
		LoginApp.primaryStage.show();
	}
	
}
