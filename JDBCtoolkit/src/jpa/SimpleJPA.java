package jpa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.SimpleRecord;

public class SimpleJPA {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("simpledb");
	private EntityManager em;
	private String connectionString;
	
	
	public SimpleJPA() {
		//Your ConnectionString
		connectionString = "jdbc:derby:c:/users/public/documents/databases/derby/simpledb/simpledb;";
		em = getEntityManager(""+getConnectionString()+";");
				

	}
	
	public List<SimpleRecord> getDbRecords(){
		List<SimpleRecord> recordList = new ArrayList<SimpleRecord>();
		if(em.isOpen())
		{
			Query q;
			q = em.createQuery("select x from SimpleRecord x");
			@SuppressWarnings("unchecked")
			List<SimpleRecord>myRecordList = q.getResultList();
			recordList.addAll(myRecordList);
		}
		return recordList;
	}
	
	@SuppressWarnings("unchecked")
	protected EntityManager getEntityManager(String url) {
	    @SuppressWarnings("unused")
		EntityManager em = null;
	    @SuppressWarnings("rawtypes")
		Map properties = new HashMap();
	    properties.put("javax.persistence.jdbc.url", url);
	    try {
	        emf = Persistence.createEntityManagerFactory("simpledb", properties);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return em = (EntityManager) emf.createEntityManager();
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
			
}
