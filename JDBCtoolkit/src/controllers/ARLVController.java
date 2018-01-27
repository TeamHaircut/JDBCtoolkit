package controllers;


import entities.Designation;
import models.ARLVModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ARLVController {

	public static ARLVModel model = new ARLVModel();
	
	@FXML private ListView<Designation> lv1;
	
	@FXML void initialize(){
		if(lv1 != null) {
			
			lv1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Designation>(){

				@Override
				public void changed(ObservableValue<? extends Designation> arg0,
						Designation arg1, Designation arg2) {
						//model.setProp(arg2);
				}	
	        });
	        lv1.itemsProperty().bindBidirectional(model.lv1Property());
	        
		}
		
	}

}
