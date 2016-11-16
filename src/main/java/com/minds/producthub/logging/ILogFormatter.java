package com.minds.producthub.logging;

import java.util.Map;

public interface ILogFormatter {
	String Format(Map<String, Object> map);
}
