package com.minds.producthub.logging;

import java.util.Map;

public class CommaLogFormatter implements ILogFormatter {

	@Override
	public String Format(Map<String, Object> map) {
		String data = "";

        for(Map.Entry<String, Object> entry : map.entrySet()) {
        	//Wrap the getValue withing double quotes
             data = data+entry.getKey() +"=\""+entry.getValue()+"\",";
        }
        
        return data.substring(0, data.length() - 1);
	}
}
