package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserProfileController {
	@FXML
	private Label labelName;

	public Label getLabelName() {
		return labelName;
	}

	public void setLabelName(String name) {
		this.labelName.setText(name);
	}

	public void logout() {
		LoginApp.switchScene(LoginApp.signinForm);
	}
	
}
