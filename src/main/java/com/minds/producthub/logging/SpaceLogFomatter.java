package com.minds.producthub.logging;

import java.util.Map;

public class SpaceLogFomatter implements ILogFormatter {

	@Override
	public String Format(Map<String, Object> map) {
		String data = "";

        for(Map.Entry<String, Object> entry : map.entrySet()) {
        	//Wrap the getValue withing double quotes
            data = data+entry.getKey() +"=\""+entry.getValue()+"\" ";
        }
        
        return data.trim();
	}

}
