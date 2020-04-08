package com.ms.api.controller;

import com.ms.common.LoginAppRequest;
import com.ms.common.Result;
import com.ms.common.Token;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "api/app/")
public class RestAppController {

    @GetMapping(value = "login")
    public Result<Token> login(@Valid LoginAppRequest request) {
        @NotBlank @NotEmpty @NotNull String app_id = request.getApp_id();
        @NotBlank @NotEmpty @NotNull String app_secret = request.getApp_secret();
        @NotBlank @NotEmpty @NotNull String os = request.getOs();

        Token token = new Token();
        token.setAccess_token("aaaaaaaaaaaaaaaaaaaaaa");

        Result<Token> result = new Result<>();
        result.setMessage("success");
        result.setCode(0);
        result.setData(token);

        return result;

    }

}
