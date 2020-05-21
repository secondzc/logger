package com.sankuai.logger.core.impl;

import com.sankuai.logger.core.Layout;
import com.sankuai.logger.core.LoggingEvent;

public class SimpleLayout implements Layout {
    @Override
    public String format(LoggingEvent event) {
        return event.getTimestamp() + "-" +
                event.getLoggerName() + "-" +
                event.getLevel() + "-" +
                event.getMsg() + "-" +
                event.getThrowable();
    }
}
