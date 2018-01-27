package controllers;

import java.util.List;

import entities.SimpleRecord;
import models.ARLVModel;
import models.SimpleModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ARLVController {

	public static ARLVModel model = new ARLVModel();
	
	@FXML void initialize(){
		
	}
	
	@FXML private Button selectBTN;
	
	@FXML
	private void selectBtnAction(ActionEvent event){
		printRecords();
	}
	
	private void printRecords(){
		List<SimpleRecord> simpleRecordList = model.getSimpleRecordList();
		for(SimpleRecord simplerecord : simpleRecordList)
		{
			System.out.println(simplerecord);		
		}
	}

}
