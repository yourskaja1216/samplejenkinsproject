package com.minds.producthub.logging;

import java.util.Map;

import org.json.JSONObject;

class JSonLogFormatter implements ILogFormatter{

	@Override
	public String Format(Map<String, Object> map) {
		JSONObject obj = new JSONObject(map);
		return obj.toString();
	}

}
