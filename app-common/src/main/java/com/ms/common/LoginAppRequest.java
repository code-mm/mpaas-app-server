package com.ms.common;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class LoginAppRequest {
    @NotBlank(message = "app_id不能为空")
    @NotEmpty(message = "app_id不能为空")
    @NotNull(message = "app_id不能为空")
    private String app_id;
    @NotBlank(message = "app_secret不能为空")
    @NotEmpty(message = "app_secret不能为空")
    @NotNull(message = "app_secret不能为空")
    private String app_secret;
    @NotBlank(message = "os不能为空")
    @NotEmpty(message = "os不能为空")
    @NotNull(message = "os不能为空")
    private String os;
}
