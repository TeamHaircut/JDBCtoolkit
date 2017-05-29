package models;

import java.util.ArrayList;
import java.util.List;

import jpa.SimpleJPA;
import entities.SimpleRecord;

public class SimpleModel {
	
	public static SimpleJPA myJPA = new SimpleJPA();
	public List<SimpleRecord> myRecordList = new ArrayList<SimpleRecord>();
	public List<SimpleRecord> getSimpleRecordList(){
		if(myJPA != null)
		myRecordList = myJPA.getDbRecords();
		return myRecordList;
	}

}
