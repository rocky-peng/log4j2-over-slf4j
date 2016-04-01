package com.log4j2.slf4j;

import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.spi.LoggerContextFactory;

import java.net.URI;

/**
 * Author :  Rocky
 * Date : 4/1/16 13:59
 * Description :
 * Test :
 */
public class Log4j2ToSlf4jContextFactory implements LoggerContextFactory {

    private static final LoggerContext context = new SimpleLoggerContext();

    public LoggerContext getContext(String fqcn, ClassLoader loader, Object externalContext, boolean currentContext) {
        return context;
    }


    public LoggerContext getContext(String fqcn, ClassLoader loader, Object externalContext, boolean currentContext, URI configLocation, String name) {
        return context;
    }


    public void removeContext(LoggerContext context) {

    }
}
