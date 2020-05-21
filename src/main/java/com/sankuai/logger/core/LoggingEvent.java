package com.sankuai.logger.core;


public class LoggingEvent {
    private String loggerName;
    private Level level;
    private String msg;
    private Throwable throwable;
    private long timestamp;

    public LoggingEvent(String loggerName, Level level, String msg, Throwable throwable) {
        this.loggerName = loggerName;
        this.level = level;
        this.msg = msg;
        this.throwable = throwable;
        this.timestamp = System.currentTimeMillis();
    }

    public String getLoggerName() {
        return loggerName;
    }

    public Level getLevel() {
        return level;
    }

    public String getMsg() {
        return msg;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
