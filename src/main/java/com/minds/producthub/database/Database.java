package com.minds.producthub.database;
import java.net.UnknownHostException;
import java.util.Map;

import org.json.JSONArray;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public abstract class Database {
	private String mongoDBServerName;
	private String mongoDbDBName;
	private DB db = null;

	public Database(String mongoDBServer, String MongoDatabaseName) {
		mongoDBServerName = mongoDBServer;
		mongoDbDBName = MongoDatabaseName;
	}

	public DB getDB() throws UnknownHostException {
		if (db != null)
			return db;

		MongoClient mongoClient = new MongoClient(mongoDBServerName);
		db = mongoClient.getDB(mongoDbDBName);
		return db;
	}

	@SuppressWarnings("unchecked")
	protected Map<String, Object> GetResultMap(DBCursor cursor)
			throws Exception {
		Map<String, Object> resultElementMap = null;
		while (cursor.hasNext()) {
			DBObject resultElement = cursor.next();
			resultElementMap = resultElement.toMap();
			resultElementMap.remove("_id");
		}
		return resultElementMap;
	}

	protected JSONArray GetResultJson(DBCursor cursor) throws Exception {
		JSONArray result = new JSONArray();
		while (cursor.hasNext()) {
			DBObject currentRecord = cursor.next();
			currentRecord.removeField("_id");
			result.put(currentRecord);
		}
		return result;
	}

}
