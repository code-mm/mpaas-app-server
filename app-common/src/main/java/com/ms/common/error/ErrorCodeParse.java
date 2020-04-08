package com.ms.common.error;

import java.util.HashMap;

public class ErrorCodeParse {

    private static final ErrorCodeParse instance = new ErrorCodeParse();

    private HashMap<String, AppError> codes = new HashMap<>();

    public static ErrorCodeParse getInstance() {
        return instance;
    }

    private ErrorCodeParse() {
        codes.put("username", AppError.builder().code(4000).cnErr("用户名为空").enErr("username null").build());
        codes.put("password", AppError.builder().code(4001).cnErr("密码为空").enErr("password null").build());
        codes.put("os", AppError.builder().code(4002).cnErr("os为空").enErr("os null").build());
    }

    public AppError parse(String field) {
        return codes.get(field);
    }
}
