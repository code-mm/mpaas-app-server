package com.ms.common.user.token;

import lombok.Data;

import javax.validation.constraints.NotNull;

// 检查token
@Data
public class UserTokenCheckRequest {


    @NotNull
    private String token;

}
