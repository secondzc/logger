package com.sankuai.logger.core;

public enum Level {
    ERROR(0, "ERROR"),
    WARN(1,"WARN"),
    INFO(2,"INFO"),
    DEBUG(3, "DEBUG"),
    TRACE(4, "TRACE"),
    ;
    private int code;
    private String desc;

    Level(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
