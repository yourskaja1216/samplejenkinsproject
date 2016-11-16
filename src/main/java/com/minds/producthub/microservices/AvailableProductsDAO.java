package com.minds.producthub.microservices;

import com.minds.producthub.database.DataDML;
import com.minds.producthub.logging.LogManager;

import java.util.HashMap;
import java.util.Map;

public class AvailableProductsDAO {

    private static final String mongoDatabaseName = "local";
    private static final String mongoDBServer = "mongo_ls";

    public boolean updateProduct(String name, String payload)
            throws Exception {
        LogManager logmanager = new LogManager("ProductHubController");
        DataDML d = new DataDML("localhost", "producthub_test", logmanager);
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("name", name);
        boolean b = d.Update("lineofbusiness_doctype", m, payload);
        return b;
    }

    public boolean insertProduct(String payload) throws Exception {
        LogManager logmanager = new LogManager("ProductHubController");
        DataDML d = new DataDML("localhost", "producthub_test", logmanager);
        boolean b = d.Insert("lineofbusiness_doctype", payload, null);
        return b;
    }
}
