package com.ms.api.controller;

import com.ms.common.error.ApiError;
import com.ms.common.utils.GsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 错误处理
 */
@Component
@Slf4j
public class AppErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);

        ApiError apiError = ApiError.builder()
                .code(Integer.parseInt(errorAttributes.get("status").toString()))
                .message("filure")
                .error(errorAttributes.get("error").toString())
                .build();


        errorAttributes.remove("timestamp");
        errorAttributes.remove("status");
        errorAttributes.remove("error");
        errorAttributes.remove("message");
        errorAttributes.remove("path");


        errorAttributes.put("code", apiError.getCode());
        errorAttributes.put("message", apiError.getMessage());
        errorAttributes.put("error", apiError.getError());

        return errorAttributes;
    }
}
