package com.sankuai.logger.core;

import com.sankuai.logger.core.filter.Filter;

public interface Appender {
    void setName(String name);
    String getName();
    void addFilter(Filter filter);
    void clearFilters();
    void setLayout(Layout layout);
    Layout getLayout();
    void append(LoggingEvent event);

}
