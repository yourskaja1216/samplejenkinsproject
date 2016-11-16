package com.minds.producthub.database;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class SearchCriteria {
    private final DBObject dbSearchCriteria;

    private SearchCriteria(
            final DBObject dbobject) {
        this.dbSearchCriteria = dbobject;
    }

    public DBObject getSearchCriteria() {
        return this.dbSearchCriteria;
    }

    public static class SearchCriteriaBuilder {
        private final DBObject dbSearchCriteria;

        public SearchCriteriaBuilder() {
            this.dbSearchCriteria = new BasicDBObject();
        }

        public SearchCriteriaBuilder ANDCondition(Map<String, Object> conditions) {
            List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
            for (Map.Entry<String, Object> entry : conditions.entrySet()) {
                obj.add(new BasicDBObject(entry.getKey(), entry.getValue()));
            }
            this.dbSearchCriteria.put("$elemMatch", obj);
            return this;
        }

        public SearchCriteria Build() {
            return new SearchCriteria(this.dbSearchCriteria);
        }
    }
}