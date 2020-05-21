package com.sankuai.logger.core.filter;

public enum FilterDecision {
    DENY(0, "DENY"),
    NEUTRAL(1, "NEUTRAL"),
    ACCEPT(2,"ACCEPT"),
    ;

    private int code;
    private String desc;

    FilterDecision(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
