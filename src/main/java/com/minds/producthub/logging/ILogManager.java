package com.minds.producthub.logging;
import org.slf4j.*;

public interface ILogManager{
	public abstract void debug(String arg0);
	public abstract void debug(Marker arg0, String arg1);
	public abstract void debug(String arg0, Object arg1);
	public abstract void debug(String arg0, Object[] arg1);
	public abstract void debug(String arg0, Throwable arg1);
	public abstract void debug(Marker arg0, String arg1, Object arg2);
	public abstract void debug(Marker arg0, String arg1, Object[] arg2);
	public abstract void debug(Marker arg0, String arg1, Throwable arg2);
	public abstract void debug(String arg0, Object arg1, Object arg2);
	public abstract void debug(Marker arg0, String arg1, String arg2, Object arg3);
	
	public abstract boolean equals(Object arg0);
	
	public abstract void  error(String arg0);
	public abstract void  error(Marker arg0, String arg1);
	public abstract void  error(String arg0, Object arg1);
	public abstract void  error(String arg0, Object[] arg1);
	public abstract void  error(String arg0, Throwable arg1);
	public abstract void  error(Marker arg0, String arg1, Object arg2);
	public abstract void  error(Marker arg0, String arg1, Object[] arg2);
	public abstract void  error(Marker arg0, String arg1, Throwable arg2);
	public abstract void  error(String arg0, Object arg1, Object arg2);
	public abstract void  error(Marker arg0, String arg1, String arg2, Object arg3);

	public abstract void  info(String arg0);
	public abstract void  info(Marker arg0, String arg1);
	public abstract void  info(String arg0, Object arg1);
	public abstract void  info(String arg0, Object[] arg1);
	public abstract void  info(String arg0, Throwable arg1);
	public abstract void  info(Marker arg0, String arg1, Object arg2);
	public abstract void  info(Marker arg0, String arg1, Object[] arg2);
	public abstract void  info(Marker arg0, String arg1, Throwable arg2);
	public abstract void  info(String arg0, Object arg1, Object arg2);
	public abstract void  info(Marker arg0, String arg1, String arg2, Object arg3);
	
	public abstract void  warn(String arg0, Object arg1);
	
}
