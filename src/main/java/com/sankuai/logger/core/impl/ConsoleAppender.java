package com.sankuai.logger.core.impl;

import com.sankuai.logger.core.AbstractAppender;
import com.sankuai.logger.core.LoggingEvent;

public class ConsoleAppender extends AbstractAppender {
    @Override
    protected void doAppend(LoggingEvent event) {
        System.out.println(layout.format(event));
    }
}
