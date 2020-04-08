package com.ms.common.error;

import java.util.HashMap;

public class ErrorCodeParse {

    private static final ErrorCodeParse instance = new ErrorCodeParse();

    private HashMap<String, AppError> codes = new HashMap<>();

    public static ErrorCodeParse getInstance() {
        return instance;
    }

    private ErrorCodeParse() {
        codes.put("username不能为空", AppError.builder().code(4000).cnErr("用户名为空").enErr("username null").build());
        codes.put("password不能为空", AppError.builder().code(4001).cnErr("密码为空").enErr("password null").build());
        codes.put("os不能为空", AppError.builder().code(4002).cnErr("os为空").enErr("os null").build());

        codes.put("app_id不能为空", AppError.builder().code(4003).cnErr("app_id为空").enErr("app_id null").build());
        codes.put("app_secret不能为空", AppError.builder().code(4004).cnErr("app_secret为空").enErr("app_secret null").build());



        codes.put("用户名不合法", AppError.builder().code(5000).cnErr("用户名不合法").enErr("os null").build());
        codes.put("密码不合法", AppError.builder().code(5001).cnErr("密码不合法").enErr("os null").build());
        codes.put("os参数不合法", AppError.builder().code(5002).cnErr("os参数不合法").enErr("os null").build());
    }

    public AppError parse(String field) {
        return codes.get(field);
    }
}
