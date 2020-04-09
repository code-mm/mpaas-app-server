package com.ms.api.controller;

import com.ms.common.Result;
import com.ms.common.route.ROUTES;
import com.ms.common.user.login.UserLoginPhonenumberRequest;
import com.ms.common.user.login.UserLoginPhonenumberRequestVerifocationCodeRequestRequest;
import com.ms.common.user.login.UserLoginUsernameRequest;
import com.ms.common.user.registered.UserRegisteredPhonenumberRequest;
import com.ms.common.user.registered.UserRegisteredPhonenumberRequestVerifocationCodeRequest;
import com.ms.common.user.token.UserTokenCheckRequest;
import com.ms.common.user.token.UserTokenRefreshRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Slf4j
@Controller
public class RSocketUserApiController {
    // 用户名登录
    @MessageMapping(ROUTES.USER_LOGIN_USERNAME)
    Result userLoginUsername(@Valid UserLoginUsernameRequest request) {
        return Result.builder().code(0).message("success").build();
    }

    // 短信登录 请求验证码
    @MessageMapping(ROUTES.USER_LOGIN_PHONENUMBER_REQUEST_VERIFICATION_CODE)
    Result userLoginPhoneRequestVerificationCode(UserLoginPhonenumberRequestVerifocationCodeRequestRequest request) {
        return Result.builder().code(0).message("success").build();
    }

    // 短信登录
    @MessageMapping(ROUTES.USER_LOGIN_PHONENUMBER)
    Result userLoginPhonenumber(UserLoginPhonenumberRequest request) {
        return Result.builder().code(0).message("success").build();
    }

    // 用户名注册
    @MessageMapping(ROUTES.USER_REGISTERED_USERNAME)
    Result userRegisteredUsername(UserLoginUsernameRequest request) {
        return Result.builder().code(0).message("success").build();
    }

    // 手机注册请求验证码
    @MessageMapping(ROUTES.USER_REGISTERED_PHONENUMBER_REQUEST_VERIFICATION_CODE)
    Result userRegisteredPhonenumberRequestVerificationCode(UserRegisteredPhonenumberRequestVerifocationCodeRequest request) {
        return Result.builder().code(0).message("success").build();
    }


    // 手机注册
    @MessageMapping(ROUTES.USER_REGISTERED_PHONENUMBER)
    Result userRegisteredPhone(UserRegisteredPhonenumberRequest request) {
        return Result.builder().code(0).message("success").build();
    }

    // 用户token 检查
    @MessageMapping(ROUTES.USER_TOKEN_CHECK)
    Result userTokenCheck(UserTokenCheckRequest request) {
        return Result.builder().code(0).message("success").build();
    }

    // 用户token 刷新
    @MessageMapping(ROUTES.USER_TOKEN_REFRESH)
    Result userTokenRefresg(UserTokenRefreshRequest request) {
        return Result.builder().code(0).message("success").build();
    }
}
