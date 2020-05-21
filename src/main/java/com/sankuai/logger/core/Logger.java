package com.sankuai.logger.core;

import com.sankuai.logger.util.LogUtil;

public class Logger {
    private AppenderRepository appenderRepository = new AppenderRepository();
    private String loggerName;

    public void info(String msg, String[] args, Throwable throwable) {
        String formatMsg = LogUtil.formatLog(msg, args);
        callAppenders(Level.INFO, formatMsg, throwable);
    }

    public void info(String msg, String... args) {
        String formatMsg = LogUtil.formatLog(msg, args);
        callAppenders(Level.INFO, formatMsg, null);
    }

    // TODO: 2020-05-21 add other levels

    private void callAppenders(Level level, String msg, Throwable throwable) {
        LoggingEvent event = new LoggingEvent(loggerName, level, msg, throwable);
        appenderRepository.appendLoopOnAppenders(event);
    }

    public Logger(String loggerName) {
        this.loggerName = loggerName;
    }
}
