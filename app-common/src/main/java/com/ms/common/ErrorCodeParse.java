package com.ms.common;

import java.util.HashMap;

public class ErrorCodeParse {

    private static final ErrorCodeParse instance = new ErrorCodeParse();

    private HashMap<String, Integer> codes = new HashMap<>();

    public static ErrorCodeParse getInstance() {
        return instance;
    }

    private ErrorCodeParse() {
        codes.put("username", 4000);
        codes.put("password", 4001);
        codes.put("os", 4002);
    }

    public Integer parse(String field) {
        return codes.get(field);
    }
}
