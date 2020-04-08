package com.ms.common;

import lombok.Data;

@Data
public class Token {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private Integer expires_in;
    private String scope;
}
