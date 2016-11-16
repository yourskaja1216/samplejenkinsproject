package com.minds.producthub.database;

import com.minds.producthub.logging.ILogManager;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.util.JSON;

import java.util.Map;

public class DataDML extends Database {

    ILogManager log = null;

    public DataDML(String mongoDBServer, String MongoDatabaseName, ILogManager logmanager) {
        super(mongoDBServer, MongoDatabaseName);
        this.log = logmanager;
    }

    public boolean Update(String collectionName, Map<String, Object> QueryForUpdate, String strJsonDataToInsert) throws Exception {
        log.debug("trying to inserOrUpdate in MongoDB.");
        DB db = super.getDB();
        DBCollection col;
        if (!db.collectionExists(collectionName)) {
            log.debug("Collection {} does not exists, creating the collection.", collectionName);
            col = db.createCollection(collectionName, new BasicDBObject());
        } else {
            log.debug("Collection {} found, getting collection object.", collectionName);
            col = db.getCollection(collectionName);
        }
        BasicDBObject queryObj = new BasicDBObject(QueryForUpdate);

        BasicDBObject dataToInsert = (BasicDBObject) JSON.parse(strJsonDataToInsert);
        log.debug("trying to insert/update data {}  to collection {}", strJsonDataToInsert, collectionName);

        WriteResult res = col.update(queryObj, dataToInsert, true, false);

        int result = res.getN();

        if (result > 0) {
            log.debug(res.getN() + "Document updated from MongoDB.");
            return true;
        } else {
            log.debug("Document is NOT updated from MongoDB.");
            return false;
        }
    }

    public boolean Insert(String collectionName, String strJsonDataToInsert, Map<String, Object> addData) throws Exception {
        log.debug("trying to inser in MongoDB.");
        DB db = getDB();
        DBCollection col;
        if (!db.collectionExists(collectionName)) {
            log.debug("Collection {} does not exists, creating the collection.", collectionName);
            col = db.createCollection(collectionName, new BasicDBObject());
        } else {
            log.debug("Collection {} found, getting collection object.", collectionName);
            col = db.getCollection(collectionName);
        }

        BasicDBObject dataToInsert = (BasicDBObject) JSON.parse(strJsonDataToInsert);

        if (addData != null && addData.size() > 0) {
            for (Map.Entry<String, Object> entry : addData.entrySet()) {
                dataToInsert.append(entry.getKey(), entry.getValue());
            }
        }
        log.debug("trying to insert data {}  to collection {}", strJsonDataToInsert, collectionName);
        WriteResult res = col.insert(dataToInsert);


        if (res.getN() > 0) {
            log.debug(res.getN() + "Document inserted from MongoDB.");
            return true;
        } else {
            log.debug("Document is NOT inserted from MongoDB.");
            return false;
        }
    }

    public boolean Delete(String collectionname, Map<String, Object> queryForDelete) throws Exception {
        log.debug("trying to Delete document from MongoDB {} {}", collectionname, queryForDelete);
        DB db = getDB();
        DBCollection col = db.getCollection(collectionname);
        BasicDBObject queryObj = new BasicDBObject(queryForDelete);
        WriteResult res = col.remove(queryObj);
        if (res.getN() > 0) {
            log.debug(res.getN() + "Document deleted from MongoDB.");
            return true;
        } else {
            log.debug("Document is NOT deleted from MongoDB.");
            return false;
        }

    }

    public int Delete(String collectionname) throws Exception {
        int recCount = 0;
        log.debug("trying to Delete document from MongoDB {} {}", collectionname);
        DB db = getDB();
        DBCollection col = db.getCollection(collectionname);
        DBCursor cursor = col.find();
        while (cursor.hasNext()) {
            WriteResult res = col.remove(cursor.next());
            recCount = recCount + res.getN();
        }
        return recCount;
    }

    public boolean Push(String collectionName, Map<String, Object> QueryForUpdate, String root, String strJsonDataToInsert) throws Exception {
        log.debug("Start: Push document into MongoDB {} {}", collectionName, QueryForUpdate);
        BasicDBObject query = new BasicDBObject();
        for (Map.Entry<String, Object> entry : QueryForUpdate.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
            query.put(entry.getKey(), entry.getValue());
        }
        System.out.println(query.toString());

        Object o = com.mongodb.util.JSON.parse(strJsonDataToInsert);
        DBObject objToInsert = (DBObject) o;
        System.out.println(objToInsert.toString());

        BasicDBObject update = new BasicDBObject();
        update.put("$push", new BasicDBObject(root, objToInsert));

        WriteResult result = super.getDB().getCollection(collectionName).update(query, update, true, true);
        System.out.println(result.getN());
        log.debug("End:  Push document into MongoDB {} {}", collectionName, QueryForUpdate);

        return true;
    }

}
