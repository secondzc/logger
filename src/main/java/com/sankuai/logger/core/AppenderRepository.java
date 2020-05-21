package com.sankuai.logger.core;


import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;

import java.util.Map;

public class AppenderRepository {
    private Map<String, Appender> appenderMap = Maps.newHashMap();

    public Appender getAppender(String name) {
        return appenderMap.get(name);
    }

    public void addAppender(Appender appender) {
        appenderMap.put(appender.getName(), appender);
    }

    public void removeAppender(String name) {
        appenderMap.remove(name);
    }

    public void appendLoopOnAppenders(LoggingEvent loggingEvent) {
        if (loggingEvent == null) {
            return ;
        }
        if (CollectionUtils.isEmpty(appenderMap.values())) {
            return ;
        }
        for (Appender appender : appenderMap.values()) {
            appender.append(loggingEvent);
        }
    }

}
