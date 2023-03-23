package com.cp.traceclient.core;

import java.util.UUID;

public class TraceUtil {
    public static String getTraceId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
