package karol.test.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuController {
	
	private MainController mainController;
	
	@FXML
	private Button KATEGORIEbutton;

	@FXML
	public void openKategorie(){
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/KATEGORIEScreen.fxml"));
		Pane pane2 = null;
		
		try {
			pane2 = loader.load();
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
	}
	
	@FXML
	public void openProfil(){
		
	}
	
	@FXML
	public void exit(){
		
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
}
