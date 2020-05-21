package com.sankuai.logger.util;

public class LogUtil {
    public static void log(String msg, Object... vars) {
        for (int i = 0; i < vars.length; i++) {
            msg = msg.replaceFirst("\\{\\}", vars[i].toString());
        }
        System.out.println(msg);
    }

    public static String formatLog(String msg, Object... vars) {
        for (int i = 0; i < vars.length; i++) {
            msg = msg.replaceFirst("\\{\\}", vars[i].toString());
        }
        return msg;
    }

    public static void main(String[] args) {
        log("test, {}", 1);
    }
}
