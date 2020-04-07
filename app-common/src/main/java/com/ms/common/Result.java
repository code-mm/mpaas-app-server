package com.ms.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {
    Integer code;
    String message;
    T data;
}
