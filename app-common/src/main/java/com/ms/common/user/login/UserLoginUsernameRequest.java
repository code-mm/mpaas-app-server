package com.ms.common.user.login;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserLoginUsernameRequest {

    @NotBlank(message = "username不能为空")
    @NotEmpty(message = "username不能为空")
    @NotNull(message = "username不能为空")
    private String username;
    @NotBlank(message = "password不能为空")
    @NotEmpty(message = "password不能为空")
    @NotNull(message = "password不能为空")
    private String password;
    @NotBlank(message = "os不能为空")
    @NotEmpty(message = "os不能为空")
    @NotNull(message = "os不能为空")
    private String os;
}
