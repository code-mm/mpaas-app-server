package com.ms.common.user.login;

import lombok.Data;

@Data
public class UserLoginPhonenumberRequest {

    private String phone_number;
    private String verification_code;

}
