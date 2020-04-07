package com.ms.api.controller;

import com.ms.common.LoginUserRequest;
import com.ms.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class RSocketUserApiController {

    @MessageMapping("user-login")
    Result login(LoginUserRequest request) {
        log.info("Received request-response request: {}", request);


         return Result.builder().code(0).message("success").build();
    }

    @MessageMapping("user-registered")
    Result registered(LoginUserRequest request) {
        log.info("Received request-response request: {}", request);
        return Result.builder().code(0).message("success").build();
    }

}
