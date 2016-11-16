package com.minds.producthub.logging;

import org.apache.log4j.Level;
import org.slf4j.Logger;

public interface ILogHandler {
	public void Log(final Level logLevel, final LogData log);
	public void LogError(final LogData log);
	public LogData.Builder LogBuilder();
	public Logger GetLogger();
	public void SetLogType(LogType type);
}