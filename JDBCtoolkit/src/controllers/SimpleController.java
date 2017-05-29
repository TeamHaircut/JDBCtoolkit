package controllers;

import java.util.List;

import entities.SimpleRecord;
import models.SimpleModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {

	public static SimpleModel simpleModel = new SimpleModel();
	
	@FXML private Button selectBTN;
	
	@FXML
	private void selectBtnAction(ActionEvent event){
		printRecords();
	}
	
	private void printRecords(){
		List<SimpleRecord> simpleRecordList = simpleModel.getSimpleRecordList();
		for(SimpleRecord simplerecord : simpleRecordList)
		{
			System.out.println(simplerecord);		
		}
	}

}
