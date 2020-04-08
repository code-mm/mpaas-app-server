package com.ms.common.error;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class ApiError {

    // 业务逻辑编码
    private Integer code;
    // 消息
    private String message;
    // 错误
    private String error;
}
