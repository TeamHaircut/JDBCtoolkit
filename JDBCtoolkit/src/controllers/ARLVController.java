package controllers;


import entities.Designation;
import models.ARLVModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;

public class ARLVController {

	public static ARLVModel model = new ARLVModel();
	
	@FXML private ListView<Designation> lv1;
	@FXML private ListView<Designation> lv2;
	
	@FXML private Button addAllBTN;
	@FXML private Button removeAllBTN;
	@FXML private Button addBTN;
	@FXML private Button removeBTN;
	
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
		if(lv1 != null) {
			
			// ** xAllBTN functionality is currently disabled
			removeAllBTN.setDisable(true);
			addAllBTN.setDisable(true);
			
			lv1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Designation>(){

				@Override
				public void changed(ObservableValue<? extends Designation> arg0,
						Designation arg1, Designation arg2) {
						model.setDesProp(arg2);
				}	
	        });
	        lv1.itemsProperty().bindBidirectional(model.lv1Property());
	        
	        lv2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Designation>(){

				@Override
				public void changed(ObservableValue<? extends Designation> arg0,
						Designation arg1, Designation arg2) {
						model.setDesProp2(arg2);
				}	
	        });
	        lv2.itemsProperty().bindBidirectional(model.lv2Property());
	        
		}
		
	}

}
