package com.ms.common.user.token;

import lombok.Data;

import javax.validation.constraints.NotNull;

// 刷新token
@Data
public class UserTokenRefreshRequest {

    @NotNull
    private String token;

}
