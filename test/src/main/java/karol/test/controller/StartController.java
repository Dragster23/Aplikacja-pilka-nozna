package karol.test.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class StartController {

	private MainController mainController;
	
	@FXML
	public void STARTApplication(){
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MENUScreen.fxml"));
		Pane pane = null;
		
		try {
			pane = loader.load();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		mainController.setScreen(pane);

	}
	
	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
}
