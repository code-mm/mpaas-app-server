package com.ms.common.user.registered;

import lombok.Data;

@Data
public class UserRegisteredPhonenumberRequest {

    private String phone_number;
    private String verification_code;


}
