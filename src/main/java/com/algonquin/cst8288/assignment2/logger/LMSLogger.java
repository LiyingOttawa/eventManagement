/**
 * File name: LMSLogger.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Assignment2
 * Date: 2024-02-17
 * Professor: Gustavo Adami
 * Purpose: LMSLogger is to log information, error...
 */
package com.algonquin.cst8288.assignment2.logger;

import java.util.logging.Level;

/**
 * LMSLogger responsible for managing application logging.
 * Utilize the singleton design pattern to ensure the initialization of only one instance of the
 * logger. This class should utilize various log levels (such as INFO, ERROR, WARNING, etc.)
 * defined into the LogLevel class and used across the entire solution. Make sure to log the
 * exception thrown by your program as well.
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-17
 */
public class LMSLogger {
    private LogLevel logLevel=LogLevel.DEBUG;
    private static LMSLogger instance;
    private static final java.util.logging.Logger appLogger = java.util.logging.Logger.getLogger("Unknown");
    private LMSLogger()
    {
        
    }
    
    public static LMSLogger getInstance()
    {
        if(instance==null)
        {
            instance = new LMSLogger();
        }
        
        return instance;
    }
    
    private Level getLevel(LogLevel logLevel)
    {
        switch(logLevel)
        {
            case ERROR:
                return Level.SEVERE;
            case WARN:
                return Level.WARNING;
            case INFO:
                return Level.INFO;
            case DEBUG:
                return Level.FINE;
            case TRACE:
                return Level.FINEST;
        }
        return Level.INFO;
    }
    
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
        appLogger.setLevel(getLevel(logLevel));
    }
    
    public void log(String message, Object... objects)
    {
        appLogger.log(getLevel(logLevel), message, objects);
    }
    
    public void log(String message, Throwable thrown)
    {
        appLogger.log(Level.SEVERE, message, thrown);
    }
}
