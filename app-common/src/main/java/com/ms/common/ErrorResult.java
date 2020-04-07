package com.ms.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResult {
    private Integer code;
    private String message;

    public static int parse(String field) {


        return 0;
    }
}
