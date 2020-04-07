package com.ms.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BDError {
    private String enErr;
    private String cnErr;
    private Integer code;
}
