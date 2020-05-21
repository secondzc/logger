package com.sankuai.logger.core.filter;

import com.sankuai.logger.core.LoggingEvent;

public interface Filter {
    FilterDecision getDecision(LoggingEvent loggingEvent);
}
