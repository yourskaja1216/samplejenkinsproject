package com.minds.producthub.rest;

import com.minds.producthub.database.QueryDb;
import com.minds.producthub.logging.LogManager;
import com.minds.producthub.microservices.AvailableProductsDAO;
import com.minds.producthub.model.doctype.ProductCoverageDoctype;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import org.json.JSONArray;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author E16035
 */
@Path("/producthub")
public class AvailableProducts {
    private static final String mongoDatabaseName = "local";
    private static final String mongoDBServer = "mongo_ls";

    private static final LogManager LOGGER = new LogManager("AvailableProducts");
    private static final QueryDb qDb = new QueryDb(mongoDBServer, mongoDatabaseName, LOGGER);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/api/availableproducts")
    public String getProductbyState() throws Exception {
    	return "hello world is here!!!";
    }


    /*@Resource(name = "mongo/sampledb")
    protected DB db;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/api/availableproducts/{state}")
    public ProductCoverageDoctype getProductbyState(@PathParam("state") String state) throws Exception {

        DBObject searchCritera = new BasicDBObject();
        searchCritera.put("statecode", state);


        JSONArray jsonarray = qDb.getDocuments("productseries_doctype", searchCritera);
        DBObject dbObj = null;
        BasicDBObject bDBObj = null;
        JSONArray retArray = new JSONArray();
        for (int i = 0; i < jsonarray.length(); i++) {
            dbObj = (DBObject) jsonarray.get(i);
            bDBObj = new BasicDBObject();
            System.out.println("{"
                    + ((dbObj.get("productcode") != null)
                    ? "\n\t\"productCode\" : \"" + dbObj.get("productcode") + "\"," : "")
                    + "\n\t\"customerType\" : [\"which collection\"],"
                    + ((dbObj.get("statename") != null) ? "\n\t\"state\" : \"" + dbObj.get("statename") + "\"," : "")
                    + "\n\t\"implementationDate\" : \"productcoverage_doctype --> coveragestartdate?\","
                    + "\n\t\"expirationDate\" : \"productcoverage_doctype --> coverageexpirationdate?\","
                    + "\n\t\"role\" : [\"which collection\"],"
                    + ((dbObj.get("productname") != null)
                    ? "\n\t\"productName\" : \"" + dbObj.get("productname") + "\"," : "")
                    + "\n\t\"Account\" : \"which collection?\","
                    + ((dbObj.get("lob") != null) ? "\n\t\"LOB\" : \"" + dbObj.get("lob") + "\"" : "") + "\n}\n");

            if (dbObj.get("productcode") != null)
                bDBObj.put("productcode", dbObj.get("productcode"));
            if (dbObj.get("customerType") != null)
                bDBObj.put("customerType", dbObj.get("customerType"));
            if (dbObj.get("statename") != null)
                bDBObj.put("statename", dbObj.get("statename"));
            if (dbObj.get("coveragestartdate") != null)
                bDBObj.put("implementationDate", dbObj.get("coveragestartdate"));
            if (dbObj.get("coverageexpirationdate") != null)
                bDBObj.put("expirationDate", dbObj.get("coverageexpirationdate"));
            if (dbObj.get("role") != null)
                bDBObj.put("role", dbObj.get("role"));
            if (dbObj.get("productname") != null)
                bDBObj.put("productname", dbObj.get("productname"));
            if (dbObj.get("Account") != null)
                bDBObj.put("Account", dbObj.get("Account"));
            if (dbObj.get("lob") != null)
                bDBObj.put("LOB", dbObj.get("lob"));

            retArray.put(bDBObj);
        }

        return null;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/api/availableproducts/")
    public String getAllProducts() throws Exception {
        LogManager logmanager = new LogManager("ProductHubController");
        QueryDb qDb = new QueryDb(mongoDBServer, mongoDatabaseName, logmanager);
        JSONArray jsonarray = qDb.getDocuments("productseries_doctype");

        DBObject dbObj = null;
        BasicDBObject bDBObj = null;
        JSONArray retArray = new JSONArray();
        for (int i = 0; i < jsonarray.length(); i++) {
            dbObj = (DBObject) jsonarray.get(i);
            bDBObj = new BasicDBObject();
            System.out.println("{"
                    + ((dbObj.get("productcode") != null)
                    ? "\n\t\"productCode\" : \"" + dbObj.get("productcode") + "\"," : "")
                    + "\n\t\"customerType\" : [\"which collection\"],"
                    + ((dbObj.get("statename") != null) ? "\n\t\"state\" : \"" + dbObj.get("statename") + "\"," : "")
                    + "\n\t\"implementationDate\" : \"productcoverage_doctype --> coveragestartdate?\","
                    + "\n\t\"expirationDate\" : \"productcoverage_doctype --> coverageexpirationdate?\","
                    + "\n\t\"role\" : [\"which collection\"],"
                    + ((dbObj.get("productname") != null)
                    ? "\n\t\"productName\" : \"" + dbObj.get("productname") + "\"," : "")
                    + "\n\t\"Account\" : \"which collection?\","
                    + ((dbObj.get("lob") != null) ? "\n\t\"LOB\" : \"" + dbObj.get("lob") + "\"" : "") + "\n}\n");

            if (dbObj.get("productcode") != null)
                bDBObj.put("productcode", dbObj.get("productcode"));
            if (dbObj.get("customerType") != null)
                bDBObj.put("customerType", dbObj.get("customerType"));
            if (dbObj.get("statename") != null)
                bDBObj.put("statename", dbObj.get("statename"));
            if (dbObj.get("role") != null)
                bDBObj.put("role", dbObj.get("role"));
            if (dbObj.get("productname") != null)
                bDBObj.put("productname", dbObj.get("productname"));
            if (dbObj.get("Account") != null)
                bDBObj.put("Account", dbObj.get("Account"));
            if (dbObj.get("lob") != null)
                bDBObj.put("LOB", dbObj.get("lob"));

            if (dbObj.get("version") != null) {
                System.out.println(dbObj.get("version").toString());
                String strJSON = dbObj.get("version").toString();
            }

            retArray.put(bDBObj);
        }

        return retArray.toString();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/api/availableproducts/")
    public String insertProduct(String payload) throws Exception {
        AvailableProductsDAO p = new AvailableProductsDAO();
        boolean b = p.insertProduct(payload);
        return (b == true) ? "true" : "false";
    }*/
}
