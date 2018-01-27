package models;

import java.util.ArrayList;
import java.util.List;

import entities.Designation;
import entities.SimpleRecord;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import jpa.ARLVJPA;
import jpa.SimpleJPA;

public class ARLVModel {
	
	public static ARLVJPA myJPA = new ARLVJPA();
	public List<Designation> myRecordList = new ArrayList<Designation>();
	public List<Designation> getRecordList(){
		if(myJPA != null)
		myRecordList = myJPA.getDbRecords();
		return myRecordList;
	}
	
	ObjectProperty<ObservableList<Designation>> lv1Prop = new SimpleObjectProperty<ObservableList<Designation>>();
	public ObjectProperty<ObservableList<Designation>> lv1Property() {
		lv1Prop.setValue(FXCollections.observableList(getRecordList()));
		return lv1Prop;
	}
	
	public void setlv1Prop(ObservableList<Designation> newlv1Prop){
		lv1Prop.setValue(newlv1Prop);	
	}
	
	public ObservableList<Designation> getlv1Prop(){
		return lv1Prop.getValue();
	}
	
		
}
