package com.ms.common;


import lombok.Data;

@Data
public class RegisteredUserRequest {

    private String username;
    private String password;
    private String os;
    private String type;
}
