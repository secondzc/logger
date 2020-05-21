package com.sankuai.logger.core;

import com.sankuai.logger.core.filter.Filter;
import com.sankuai.logger.core.filter.FilterChain;

public abstract class AbstractAppender implements Appender {
    protected String appenderName;
    protected Layout layout;
    protected FilterChain filterChain;

    @Override
    public void setName(String name) {
        this.appenderName = name;
    }

    @Override
    public String getName() {
        return appenderName;
    }

    @Override
    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    @Override
    public void clearFilters() {
        filterChain.clearFilters();
    }

    @Override
    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    @Override
    public Layout getLayout() {
        return layout;
    }

    @Override
    public void append(LoggingEvent event) {
        if (filterChain.isIntercept(event)) {
            return ;
        }
        doAppend(event);
    }

    protected abstract void doAppend(LoggingEvent event);
}
