package com.ms.api.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.ms.common.*;
import com.ms.common.exception.AppRuntimeException;
import com.ms.common.utils.MD5Utils;
import com.ms.common.utils.OSUtils;
import com.ms.common.utils.RegexUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/user/")
@Slf4j
public class RestUserApiController {
    @PostMapping(value = "login")
    public Result login(@RequestBody @Valid LoginUserRequest request) {
        log.info("login", request);

        @NotNull @NotBlank @NotEmpty String username = request.getUsername();
        @NotNull @NotBlank @NotEmpty String password = request.getPassword();
        @NotNull @NotBlank @NotEmpty String os = request.getOs();


        if (RegexUtils.getInstance().isMobileExact(username) || RegexUtils.getInstance().isUsername(username)) {

        } else {
            throw new AppRuntimeException("用户名不合法");
        }

        if (!OSUtils.ok(os)) {
            throw new AppRuntimeException("os参数不合法");
        }


        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setUserid(MD5Utils.md5(UUID.randomUUID().toString()) + System.currentTimeMillis());

        String token = JWT.create().withAudience(user.getUserid())
                .sign(Algorithm.HMAC256(user.getPassword()));

        Result result = Results.SUCCESS;
        result.setData(token);
        return result;
    }

    // 用户名注册
    @PostMapping(value = "registered-username")
    public Result registeredUsername(@RequestBody RegisteredUserRequest request) {
        log.info("registered", request);
        return Results.SUCCESS;
    }

    // 手机注册请求验证码
    @PostMapping(value = "registered-phonenumber-verificationcode")
    public Result registeredPhoneNumberVerificationCode(@RequestBody RegisteredUserRequest request) {
        log.info("registered", request);
        return Results.SUCCESS;
    }

    // 手机注册
    @PostMapping(value = "registered-phonenumber")
    public Result registeredPhoneNumber(@RequestBody RegisteredUserRequest request) {
        log.info("registered", request);
        return Results.SUCCESS;
    }
}
