package models;

import java.util.ArrayList;
import java.util.List;

import entities.Entity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import jpa.ARLVJPA;

public class ARLVModel {
	
	public void addAll() {
	}
	
	public void removeAll() {
	}
	
	public void add() {
		if(getEntityProp()!=null) {
			Entity e = getEntityProp();
			lvEntity1Prop.get().remove(e);
			lvEntity2Prop.get().add(e);
		}
	}
	
	public void remove() {
		if(getEntityProp2()!=null) {
			Entity e = getEntityProp2();
			lvEntity2Prop.get().remove(e);
			lvEntity1Prop.get().add(e);
		}
	}
	
	public static ARLVJPA myJPA = new ARLVJPA();
	public List<Entity> myRecordList = new ArrayList<Entity>();
	public List<Entity> getDBRecordList(){
			if(myJPA != null)
			myRecordList = myJPA.getDbRecords();
		return myRecordList;
	}
	
	ObjectProperty<ObservableList<Entity>> lvEntity1Prop = new SimpleObjectProperty<ObservableList<Entity>>();
	public ObjectProperty<ObservableList<Entity>> lvEntity1Property() {
		lvEntity1Prop.setValue(FXCollections.observableList(getDBRecordList()));
		return lvEntity1Prop;
	}
	
	public void setlvEntity1Prop(ObservableList<Entity> newlv1Prop){
		lvEntity1Prop.setValue(newlv1Prop);	
	}
	
	public ObservableList<Entity> getlvEntity1Prop(){
		return lvEntity1Prop.getValue();
	}
	
	//
	ObjectProperty<ObservableList<Entity>> lvEntity2Prop = new SimpleObjectProperty<ObservableList<Entity>>();
	public ObjectProperty<ObservableList<Entity>> lvEntity2Property() {
		lvEntity2Prop.setValue(FXCollections.observableList(new ArrayList<Entity>()));
		return lvEntity2Prop;
	}
	
	public void setlvEntity2Prop(ObservableList<Entity> newlv2Prop){
		lvEntity2Prop.setValue(newlv2Prop);	
	}
	
	public ObservableList<Entity> getlvEntity2Prop(){
		return lvEntity2Prop.getValue();
	}
	//
	
	ObjectProperty<Entity> EntityProp = new SimpleObjectProperty<Entity>();
	public ObjectProperty<Entity> EntityProperty(){
		return EntityProp;
	}
	public void setEntityProp(Entity newDes){
		EntityProp.setValue(newDes);
	}
	public Entity getEntityProp(){
		return EntityProp.getValue();
	}
	
	ObjectProperty<Entity> EntityProp2 = new SimpleObjectProperty<Entity>();
	public ObjectProperty<Entity> EntityProperty2(){
		return EntityProp2;
	}
	public void setEntityProp2(Entity newDes){
		EntityProp2.setValue(newDes);
	}
	public Entity getEntityProp2(){
		return EntityProp2.getValue();
	}
	
}
