package models;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ARLVModel {
	
	ObjectProperty<ObservableList<String>> lv1Prop = new SimpleObjectProperty<ObservableList<String>>();
	public ObjectProperty<ObservableList<String>> lv1Property() {
		lv1Prop.setValue(FXCollections.observableList(getList()));
		return lv1Prop;
	}
	
	public void setlv1Prop(ObservableList<String> newlv1Prop){
		lv1Prop.setValue(newlv1Prop);	
	}
	
	public ObservableList<String> getlv1Prop(){
		return lv1Prop.getValue();
	}
	
	private List<String> myList = new ArrayList<String>();
	private List<String> getList(){
		
		myList.add("NP");
		myList.add("NHS");
		
		return myList;
	}
	
	
}
