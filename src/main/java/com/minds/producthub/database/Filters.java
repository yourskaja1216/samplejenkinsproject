package com.minds.producthub.database;

import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class Filters {

	public static DBObject GetQueryList(Map<Object, Object> query){
		DBObject obj = new BasicDBObject(query);
		obj.putAll(query);
		return obj;
	}
	
	public static DBObject GetFieldList(List<String> fields){
		DBObject db = new BasicDBObject();
		if(fields != null){
			for(String field : fields){
				db.put(field, 1);
			}
		}
		return db;
	}

}
