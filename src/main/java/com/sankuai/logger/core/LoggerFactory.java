package com.sankuai.logger.core;

public class LoggerFactory {
    public Logger getLogger(Class clz) {
        return new Logger(clz.getName());
    }

}
