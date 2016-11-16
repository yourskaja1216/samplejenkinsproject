package com.minds.producthub.logging;

import org.apache.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class LogHandler implements ILogHandler {

    public static ILogHandler CreateLogHandler(LogType logtype, String InstanceId, String servicename, String versionnumber, String hostname, String ipaddress, String processId) {
        LogHandler handler = new LogHandler(servicename);
        handler.logmap = new HashMap<String, Object>();
        handler.logmap.put("EIBLog.Servicename", servicename);
        handler.logmap.put("EIBLog.Instanceid", InstanceId);
        handler.logmap.put("EIBLog.Version", versionnumber);
        handler.logmap.put("EIBLog.HostName", hostname);
        handler.logmap.put("EIBLog.IPAddress", ipaddress);
        handler.logmap.put("EIBLog.ProcessId", processId);

        handler.setLogFormat(logtype);
        //handler.logger = LoggerFactory.getLogger(servicename);

        return handler;
    }

    private Map<String, Object> logmap = null;
    private Logger logger = null;
    private LogType format = LogType.COMMA;
    private ILogFormatter formatter = new CommaLogFormatter();

    public LogHandler(String logname) {
        logger = LoggerFactory.getLogger(logname);
    }

    public void setLogFormat(LogType _format) {
        this.format = _format;
        switch (this.format) {
            case JSON:
                this.formatter = new JSonLogFormatter();
                break;
            case PIPE:
                this.formatter = new PipeLogFormatter();
                break;
            case SPACE:
                this.formatter = new SpaceLogFomatter();
                break;
            case COMMA:
                this.formatter = new CommaLogFormatter();
                break;
            default:
                break;
        }
    }

    public ILogFormatter getLogFormatter() {
        if (this.formatter == null) setLogFormat(this.format);
        return this.formatter;
    }

    @Override
    public Logger GetLogger() {
        return this.logger;
    }

    @Override
    public void SetLogType(LogType type) {
        this.setLogFormat(type);
    }

    @Override
    public LogData.Builder LogBuilder() {
        return new LogData.Builder(logmap);
    }

    @Override
    public void Log(Level logLevel, LogData log) {
        LogMessage(logLevel, getLogFormatter().Format(log.getLog()));
    }

    @Override
    public void LogError(LogData log) {
        LogMessage(Level.ERROR, getLogFormatter().Format(log.getLog()));
    }

    private void LogMessage(Level level, String log) {
        if (level == Level.INFO)
            logger.info(log);
        else if (level == Level.DEBUG)
            logger.debug(log);
        else if (level == Level.ERROR || level == Level.FATAL)
            logger.error(log);
        else if (level == Level.WARN)
            logger.warn(log);
        else
            logger.info(log);
    }


}
