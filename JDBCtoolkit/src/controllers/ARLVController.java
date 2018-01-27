//model.getlv2Prop() contains search criteria
package controllers;

import entities.Entity;
import models.ARLVModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;

public class ARLVController {

	public static ARLVModel model = new ARLVModel();
	
	@FXML private ListView<Entity> lvEntity1;
	@FXML private ListView<Entity> lvEntity2;
	
	@FXML private Button addAllEntityBTN;
	@FXML private Button removeAllEntityBTN;
	@FXML private Button addEntityBTN;
	@FXML private Button removeEntityBTN;
	
	@FXML
	private void addAction() {
		model.add();
	}
	
	@FXML 
	private void removeAction() {
		model.remove();
	}
	
	@FXML
	private void addAllAction() {
		model.addAll();
	}
	
	@FXML
	private void removeAllAction() {
		model.removeAll();
	}
	
	@FXML void initialize(){
		if(lvEntity1 != null) {
			
			// ** xAllBTN functionality is currently disabled
			removeAllEntityBTN.setDisable(true);
			addAllEntityBTN.setDisable(true);
			
			lvEntity1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Entity>(){

				@Override
				public void changed(ObservableValue<? extends Entity> arg0,
						Entity arg1, Entity arg2) {
						model.setEntityProp(arg2);
				}	
	        });
	        lvEntity1.itemsProperty().bindBidirectional(model.lvEntity1Property());
	        
	        lvEntity2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Entity>(){

				@Override
				public void changed(ObservableValue<? extends Entity> arg0,
						Entity arg1, Entity arg2) {
						model.setEntityProp2(arg2);
				}	
	        });
	        lvEntity2.itemsProperty().bindBidirectional(model.lvEntity2Property());
	        
		}
		
	}

}
