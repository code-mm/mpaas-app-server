package com.ms.common.error;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppError {
    private String enErr;
    private String cnErr;
    private Integer code;
}
