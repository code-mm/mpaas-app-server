package com.ms.api.controller;

import com.ms.common.LoginUserRequest;
import com.ms.common.RegisteredUserRequest;
import com.ms.common.Result;
import com.ms.common.Results;
import com.ms.common.utils.GsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/user/")
@Slf4j
public class RestUserApiController {
    @PostMapping(value = "login")
    public Result login(@RequestBody @Valid LoginUserRequest request) {

        log.info("login", request);
        return Results.SUCCESS;
    }

    @PostMapping(value = "registered")
    public Result registered(@RequestBody RegisteredUserRequest request) {
        log.info("registered", request);
        return Results.SUCCESS;
    }
}
