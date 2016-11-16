package com.minds.producthub.database;

import com.minds.producthub.logging.ILogManager;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import org.json.JSONArray;

public class QueryDb extends Database {

    ILogManager log = null;

    public QueryDb(String mongoDBServer, String MongoDatabaseName, ILogManager logmanager) {
        super(mongoDBServer, MongoDatabaseName);
        this.log = logmanager;
    }

    public JSONArray getDocuments(String collectionname) throws Exception {
        log.debug("trying to get All documents from MongoDB collection {}", collectionname);
        DB db = getDB();
        DBCollection col = db.getCollection(collectionname);
        DBCursor cursor = col.find();
        return super.GetResultJson(cursor);
    }

    public JSONArray getDocuments(String collectionname, DBObject searchCriteria) throws Exception {
        log.debug("trying to get All documents from MongoDB collection {}", collectionname);
        DB db = getDB();
        DBCollection col = db.getCollection(collectionname);
        DBCursor cursor = col.find(searchCriteria);
        return super.GetResultJson(cursor);
    }

    public JSONArray getDocuments(String collectionname, DBObject searchCriteria, DBObject returnfieldList) throws Exception {
        log.debug("trying to get All documents from MongoDB collection {}", collectionname);
        DB db = getDB();
        DBCollection col = db.getCollection(collectionname);
        DBCursor cursor = col.find(searchCriteria, returnfieldList);
        return super.GetResultJson(cursor);
    }

	/*public String Distinct(String collectionname,String returnfield, DBObject searchCriteria) throws Exception {
         log.debug("trying to get distinct from MongoDB collection {}", collectionname);
		 DB db = getDB();
		 DBCollection col = db.getCollection(collectionname);
		 List<?> cursor = col.distinct(returnfield, searchCriteria);
		 Gson gson = new Gson();
		  
		 String j = gson.toJson(cursor);
				 
		 return j;
	}*/


/*	public Map<?,?> getDocuments(String collectionname, Map<Object, Object> query,List<String> fields) throws Exception {
        log.debug("trying to get documents by query from colleciton {} using query {} ", collectionname, query);
		DB db = getDB();
		DBCollection col = db.getCollection(collectionname);
		 
		DBObject dbQuery = Filters.GetList(null, query);
		DBObject dbFieldFilter = Filters.GetFieldList(fields);
		DBCursor cursor = col.find(dbQuery,dbFieldFilter);
		return super.GetResultMap(cursor);
	}

	public Map<?,?> getDocuments(String collectionname, String fieldName, String[]  values) throws Exception {
		log.debug("trying to get documents by query from colleciton {} using query {} ", collectionname, values);
		DBCollection col = super.getDB().getCollection(collectionname);
		 
	    List<String> list  = Arrays.asList(values);
	    DBObject dbQuery = new BasicDBObject(fieldName, new BasicDBObject("$in", list));
		
		DBCursor cursor = col.find(dbQuery);

		return super.GetResultMap(cursor);
	}
*/


}
