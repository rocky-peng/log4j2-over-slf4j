package com.log4j2.slf4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.slf4j.Logger;

/**
 * Author :  Rocky
 * Date : 4/1/16 14:32
 * Description :
 * Test :
 */
public class ExtendedLoggerAdapter implements ExtendedLogger {


    private Logger logger;

    public ExtendedLoggerAdapter(Logger logger) {
        this.logger = logger;
    }

    public boolean isEnabled(Level level, Marker marker, Message message, Throwable t) {
        return isEnabled(level);
    }

    public boolean isEnabled(Level level, Marker marker, Object message, Throwable t) {
        return isEnabled(level);
    }

    public boolean isEnabled(Level level, Marker marker, String message, Throwable t) {
        return isEnabled(level);
    }

    public boolean isEnabled(Level level, Marker marker, String message) {
        return isEnabled(level);
    }

    public boolean isEnabled(Level level, Marker marker, String message, Object... params) {
        return isEnabled(level);
    }

    public void logIfEnabled(String fqcn, Level level, Marker marker, Message message, Throwable t) {
        log(level, marker, message, t);
    }

    public void logIfEnabled(String fqcn, Level level, Marker marker, Object message, Throwable t) {
        log(level, marker, message, t);
    }

    public void logIfEnabled(String fqcn, Level level, Marker marker, String message, Throwable t) {
        log(level, marker, message, t);
    }

    public void logIfEnabled(String fqcn, Level level, Marker marker, String message) {
        log(level, marker, message);
    }

    public void logIfEnabled(String fqcn, Level level, Marker marker, String message, Object... params) {
        log(level, marker, message, params);
    }

    public void logMessage(String fqcn, Level level, Marker marker, Message message, Throwable t) {
        log(level, marker, message, t);
    }

    public void catching(Level level, Throwable t) {
        logger.error("", t);
    }

    public void catching(Throwable t) {
        logger.error("", t);
    }

    public void debug(Marker marker, Message msg) {
        if (msg != null) {
            logger.debug(msg.toString());
        }
    }

    public void debug(Marker marker, Message msg, Throwable t) {
        if (msg != null) {
            logger.debug(msg.toString(), t);
        }
    }

    public void debug(Marker marker, Object message) {
        if (message != null) {
            logger.debug(message.toString());
        }
    }

    public void debug(Marker marker, Object message, Throwable t) {
        if (message != null) {
            logger.debug(message.toString(), t);
        }
    }

    public void debug(Marker marker, String message) {
        logger.debug(message);
    }

    public void debug(Marker marker, String message, Object... params) {
        logger.debug(message, params);
    }

    public void debug(Marker marker, String message, Throwable t) {
        logger.debug(message, t);
    }

    public void debug(Message msg) {
        if (msg != null) {
            logger.debug(msg.toString());
        }
    }

    public void debug(Message msg, Throwable t) {
        if (msg != null) {
            logger.debug(msg.toString(), t);
        }
    }

    public void debug(Object message) {
        if (message != null) {
            logger.debug(message.toString());
        }
    }

    public void debug(Object message, Throwable t) {
        if (message != null) {
            logger.debug(message.toString(), t);
        }
    }

    public void debug(String message) {
        logger.debug(message);
    }

    public void debug(String message, Object... params) {
        logger.debug(message, params);
    }

    public void debug(String message, Throwable t) {
        logger.debug(message, t);
    }

    public void entry() {
        //do thing
    }

    public void entry(Object... params) {
        //do thing
    }

    public void error(Marker marker, Message msg) {
        if (msg != null) {
            logger.error(msg.toString());
        }
    }

    public void error(Marker marker, Message msg, Throwable t) {
        if (msg != null) {
            logger.error(msg.toString(), t);
        }
    }

    public void error(Marker marker, Object message) {
        if (message != null) {
            logger.error(message.toString());
        }
    }

    public void error(Marker marker, Object message, Throwable t) {
        if (message != null) {
            logger.error(message.toString(), t);
        }
    }

    public void error(Marker marker, String message) {
        logger.error(message);
    }

    public void error(Marker marker, String message, Object... params) {
        logger.error(message, params);
    }

    public void error(Marker marker, String message, Throwable t) {
        logger.error(message, t);
    }

    public void error(Message msg) {
        if (msg != null) {
            logger.error(msg.toString());
        }
    }

    public void error(Message msg, Throwable t) {
        if (msg != null) {
            logger.error(msg.toString(), t);
        }
    }

    public void error(Object message) {
        if (message != null) {
            logger.error(message.toString());
        }
    }

    public void error(Object message, Throwable t) {
        if (message != null) {
            logger.error(message.toString(), t);
        }
    }

    public void error(String message) {
        logger.error(message);
    }

    public void error(String message, Object... params) {
        logger.error(message, params);
    }

    public void error(String message, Throwable t) {
        logger.error(message, t);
    }

    public void exit() {
        //do nothing
    }

    public <R> R exit(R result) {
        return null;
    }

    public void fatal(Marker marker, Message msg) {
        error(marker, msg);
    }

    public void fatal(Marker marker, Message msg, Throwable t) {
        error(marker, msg, t);
    }

    public void fatal(Marker marker, Object message) {
        error(marker, message);
    }

    public void fatal(Marker marker, Object message, Throwable t) {
        error(marker, message, t);
    }

    public void fatal(Marker marker, String message) {
        error(marker, message);
    }

    public void fatal(Marker marker, String message, Object... params) {
        error(marker, message, params);
    }

    public void fatal(Marker marker, String message, Throwable t) {
        error(marker, message, t);
    }

    public void fatal(Message msg) {
        error(msg);
    }

    public void fatal(Message msg, Throwable t) {
        error(msg, t);
    }

    public void fatal(Object message) {
        error(message);
    }

    public void fatal(Object message, Throwable t) {
        error(message, t);
    }

    public void fatal(String message) {
        error(message);
    }

    public void fatal(String message, Object... params) {
        error(message, params);
    }

    public void fatal(String message, Throwable t) {
        error(message, t);
    }

    public Level getLevel() {
        if (logger.isTraceEnabled()) {
            return Level.ALL;
        }
        if (logger.isDebugEnabled()) {
            return Level.DEBUG;
        }
        if (logger.isInfoEnabled()) {
            return Level.INFO;
        }
        if (logger.isWarnEnabled()) {
            return Level.WARN;
        }
        if (logger.isErrorEnabled()) {
            return Level.ERROR;
        }
        return Level.OFF;
    }

    public MessageFactory getMessageFactory() {
        return null;
    }

    public String getName() {
        return logger.getName();
    }

    public void info(Marker marker, Message msg) {
        if (msg != null) {
            logger.info(msg.toString());
        }
    }

    public void info(Marker marker, Message msg, Throwable t) {
        if (msg != null) {
            logger.info(msg.toString(), t);
        }
    }

    public void info(Marker marker, Object message) {
        if (message != null) {
            logger.info(message.toString());
        }
    }

    public void info(Marker marker, Object message, Throwable t) {
        if (message != null) {
            logger.info(message.toString(), t);
        }
    }

    public void info(Marker marker, String message) {
        logger.info(message);
    }

    public void info(Marker marker, String message, Object... params) {
        logger.info(message, params);
    }

    public void info(Marker marker, String message, Throwable t) {
        logger.info(message, t);
    }

    public void info(Message msg) {
        if (msg != null) {
            logger.info(msg.toString());
        }
    }

    public void info(Message msg, Throwable t) {
        if (msg != null) {
            logger.info(msg.toString(), t);
        }
    }

    public void info(Object message) {
        if (message != null) {
            logger.info(message.toString());
        }
    }

    public void info(Object message, Throwable t) {
        if (message != null) {
            logger.info(message.toString(), t);
        }
    }

    public void info(String message) {
        logger.info(message);
    }

    public void info(String message, Object... params) {
        logger.info(message, params);
    }

    public void info(String message, Throwable t) {
        logger.info(message, t);
    }

    public boolean isDebugEnabled() {
        return isEnabled(Level.DEBUG);
    }

    public boolean isDebugEnabled(Marker marker) {
        return isEnabled(Level.DEBUG);
    }

    public boolean isEnabled(Level level) {
        if (level == Level.ALL || level == Level.TRACE) {
            return logger.isTraceEnabled();
        }
        if (level == Level.DEBUG) {
            return logger.isDebugEnabled();
        }
        if (level == Level.INFO) {
            return logger.isInfoEnabled();
        }
        if (level == Level.WARN) {
            return logger.isWarnEnabled();
        }
        if (level == Level.ERROR || level == Level.FATAL) {
            return logger.isErrorEnabled();
        }
        if (level == Level.OFF) {
            return !logger.isTraceEnabled();
        }
        return true;
    }

    public boolean isEnabled(Level level, Marker marker) {
        return isEnabled(level);
    }

    public boolean isErrorEnabled() {
        return isEnabled(Level.ERROR);
    }

    public boolean isErrorEnabled(Marker marker) {
        return isEnabled(Level.ERROR);
    }

    public boolean isFatalEnabled() {
        return isEnabled(Level.FATAL);
    }

    public boolean isFatalEnabled(Marker marker) {
        return isEnabled(Level.FATAL);
    }

    public boolean isInfoEnabled() {
        return isEnabled(Level.INFO);
    }

    public boolean isInfoEnabled(Marker marker) {
        return isEnabled(Level.INFO);
    }

    public boolean isTraceEnabled() {
        return isEnabled(Level.TRACE);
    }

    public boolean isTraceEnabled(Marker marker) {
        return isEnabled(Level.TRACE);
    }

    public boolean isWarnEnabled() {
        return isEnabled(Level.WARN);
    }

    public boolean isWarnEnabled(Marker marker) {
        return isEnabled(Level.WARN);
    }


    public void log(Level level, Marker marker, String message) {
        if (level == Level.ALL || level == Level.TRACE) {
            logger.trace(message);
        }
        if (level == Level.DEBUG) {
            logger.debug(message);
        }
        if (level == Level.INFO) {
            logger.info(message);
        }
        if (level == Level.WARN) {
            logger.warn(message);
        }
        if (level == Level.ERROR || level == Level.FATAL) {
            logger.error(message);
        }
    }

    public void log(Level level, Marker marker, String message, Object... params) {
        if (level == Level.ALL || level == Level.TRACE) {
            logger.trace(message, params);
        }
        if (level == Level.DEBUG) {
            logger.debug(message, params);
        }
        if (level == Level.INFO) {
            logger.info(message, params);
        }
        if (level == Level.WARN) {
            logger.warn(message, params);
        }
        if (level == Level.ERROR || level == Level.FATAL) {
            logger.error(message, params);
        }
    }

    public void log(Level level, Marker marker, String message, Throwable t) {
        if (level == Level.ALL || level == Level.TRACE) {
            logger.trace(message, t);
        }
        if (level == Level.DEBUG) {
            logger.debug(message, t);
        }
        if (level == Level.INFO) {
            logger.info(message, t);
        }
        if (level == Level.WARN) {
            logger.warn(message, t);
        }
        if (level == Level.ERROR || level == Level.FATAL) {
            logger.error(message, t);
        }
    }


    public void log(Level level, Marker marker, Message msg) {
        if (msg != null) {
            log(level, marker, msg.toString());
        }
    }

    public void log(Level level, Marker marker, Message msg, Throwable t) {
        if (msg != null) {
            log(level, marker, msg.toString(), t);
        }
    }

    public void log(Level level, Marker marker, Object msg) {
        if (msg != null) {
            log(level, marker, msg.toString());
        }
    }

    public void log(Level level, Marker marker, Object msg, Throwable t) {
        if (msg != null) {
            log(level, marker, msg.toString(), t);
        }
    }


    public void log(Level level, Message msg) {
        log(level, null, msg);
    }

    public void log(Level level, Message msg, Throwable t) {
        log(level, null, msg, t);
    }

    public void log(Level level, Object message) {
        log(level, null, message);
    }

    public void log(Level level, Object message, Throwable t) {
        log(level, null, message, t);
    }

    public void log(Level level, String message) {
        log(level, null, message);
    }

    public void log(Level level, String message, Object... params) {
        log(level, null, message, params);
    }

    public void log(Level level, String message, Throwable t) {
        log(level, null, message, t);
    }

    public void printf(Level level, Marker marker, String format, Object... params) {
        log(level, marker, format, params);
    }

    public void printf(Level level, String format, Object... params) {
        log(level, null, format, params);
    }

    public <T extends Throwable> T throwing(Level level, T t) {
        log(level, null, "", t);
        return t;
    }

    public <T extends Throwable> T throwing(T t) {
        Level level = getLevel();
        log(level, null, "", t);
        return t;
    }

    public void trace(Marker marker, Message msg) {
        if (msg != null) {
            logger.trace(msg.toString());
        }
    }

    public void trace(Marker marker, Message msg, Throwable t) {
        if (msg != null) {
            logger.trace(msg.toString(), t);
        }
    }

    public void trace(Marker marker, Object message) {
        if (message != null) {
            logger.trace(message.toString());
        }
    }

    public void trace(Marker marker, Object message, Throwable t) {
        if (message != null) {
            logger.trace(message.toString(), t);
        }
    }

    public void trace(Marker marker, String message) {
        logger.trace(message);
    }

    public void trace(Marker marker, String message, Object... params) {
        logger.trace(message, params);
    }

    public void trace(Marker marker, String message, Throwable t) {
        logger.trace(message, t);
    }

    public void trace(Message msg) {
        if (msg != null) {
            logger.trace(msg.toString());
        }
    }

    public void trace(Message msg, Throwable t) {
        if (msg != null) {
            logger.trace(msg.toString(), t);
        }
    }

    public void trace(Object message) {
        if (message != null) {
            logger.trace(message.toString());
        }
    }

    public void trace(Object message, Throwable t) {
        if (message != null) {
            logger.trace(message.toString(), t);
        }
    }

    public void trace(String message) {
        logger.trace(message);
    }

    public void trace(String message, Object... params) {
        logger.trace(message, params);
    }

    public void trace(String message, Throwable t) {
        logger.trace(message, t);
    }

    public void warn(Marker marker, Message msg) {
        if (msg != null) {
            logger.warn(msg.toString());
        }
    }

    public void warn(Marker marker, Message msg, Throwable t) {
        if (msg != null) {
            logger.warn(msg.toString(), t);
        }
    }

    public void warn(Marker marker, Object message) {
        if (message != null) {
            logger.warn(message.toString());
        }
    }

    public void warn(Marker marker, Object message, Throwable t) {
        if (message != null) {
            logger.warn(message.toString(), t);
        }
    }

    public void warn(Marker marker, String message) {
        logger.warn(message);
    }

    public void warn(Marker marker, String message, Object... params) {
        logger.warn(message, params);
    }

    public void warn(Marker marker, String message, Throwable t) {
        logger.warn(message, t);
    }

    public void warn(Message msg) {
        if (msg != null) {
            logger.warn(msg.toString());
        }
    }

    public void warn(Message msg, Throwable t) {
        if (msg != null) {
            logger.warn(msg.toString(), t);
        }
    }

    public void warn(Object message) {
        if (message != null) {
            logger.warn(message.toString());
        }
    }

    public void warn(Object message, Throwable t) {
        if (message != null) {
            logger.warn(message.toString(), t);
        }
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void warn(String message, Object... params) {
        logger.warn(message, params);
    }

    public void warn(String message, Throwable t) {
        logger.warn(message, t);
    }
}
