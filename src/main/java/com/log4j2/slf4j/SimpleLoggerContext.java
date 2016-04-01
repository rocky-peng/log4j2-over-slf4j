package com.log4j2.slf4j;

import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Author :  Rocky
 * Date : 4/1/16 14:26
 * Description :
 * Test :
 */
public class SimpleLoggerContext implements LoggerContext {

    private static final ConcurrentHashMap<String, ExtendedLogger> loggerMap = new ConcurrentHashMap<String, ExtendedLogger>();

    public Object getExternalContext() {
        return null;
    }

    public ExtendedLogger getLogger(String name) {
        if (!loggerMap.containsKey(name)) {
            Logger logger = LoggerFactory.getLogger(name);
            loggerMap.put(name, new ExtendedLoggerAdapter(logger));
        }
        return loggerMap.get(name);
    }

    public ExtendedLogger getLogger(String name, MessageFactory messageFactory) {
        return getLogger(name);
    }

    public boolean hasLogger(String name) {
        return loggerMap.containsKey(name);
    }
}
