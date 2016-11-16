package com.minds.producthub.logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class LogData {
    private Map<String, Object> _logdata = new HashMap<String, Object>();

    public LogData(Map<String, Object> initialdata) {
        if (initialdata != null && initialdata.size() > 0) {
            for (Map.Entry<String, Object> entry : initialdata.entrySet()) {
                _logdata.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void ClassName(String classname) {
        AddLog("EIBLog.ClassName", classname);
    }

    public void TransactionId(String transactionid) {
        AddLog("EIBLog.TransactionID", transactionid);
    }

    public void EventType(String eventtype) {
        AddLog("EIBLog.EventType", eventtype);
    }

    public void MethodName(String methdoname) {
        AddLog("EIBLog.MethodName", methdoname);
    }

    public void Message(String logmessage) {
        AddLog("EIBLog.Message", logmessage);
    }

    public void Error(Exception e) {
        if (e != null) {
            AddLog("EIBLog.ErrorType", e.getClass().getName());

            StackTraceElement[] trace = e.getStackTrace();
            String result = "";
            for (int i = 0; i < trace.length; i++) {
                result += trace[i].toString() + "\n";
            }

            AddLog("EIBLog.StackTrace", result);
        }
    }

    public Map<String, Object> getLog() {
        return this._logdata;
    }

    public void AddLog(String key, Object value) {
        try {
            if (key != null && key.length() > 0) this._logdata.put(key, value);
        } catch (Exception e) {
        }
    }

    public static class Builder {
        LogData log;

        public Builder(Map<String, Object> _log) {
            if (_log != null)
                log = new LogData(_log);
            else
                log = new LogData(null);
        }

        public Builder ClassName(String classname) {
            log.ClassName(classname);
            return this;
        }

        public Builder TransactionId(String transactionid) {
            log.TransactionId(transactionid);
            return this;
        }

        public Builder EventType(String eventtype) {
            log.EventType(eventtype);
            return this;
        }

        public Builder MethodName(String methdoname) {
            log.MethodName(methdoname);
            return this;
        }

        public Builder Message(String logmessage) {
            log.Message(logmessage);
            return this;
        }

        public Builder Error(Exception e) {
            log.Error(e);
            return this;
        }

        public Builder AddLog(String key, Object value) {
            log.AddLog(key, value);
            return this;
        }

        public LogData Build() {
            log.AddLog("EIBLog.Timestamp", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
            return this.log;
        }
    }

}
