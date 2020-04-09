package com.ms.common.route;

public interface ROUTES {

    // 用户名注册
    String USER_REGISTERED_USERNAME = "#user/registered/username";
    // 手机注册 请求验证码
    String USER_REGISTERED_PHONENUMBER_REQUEST_VERIFICATION_CODE = "#user/registered/request-phonenumber-verification-code";
    // 手机注册
    String USER_REGISTERED_PHONENUMBER = "#user/registered/phonenumber";

    // 用户名 密码 登录
    String USER_LOGIN_USERNAME = "#user/login/username";
    // 登录 请求短信验证码
    String USER_LOGIN_PHONENUMBER_REQUEST_VERIFICATION_CODE = "#user/login/request-phonenumber-verification-code";
    // 短信登录
    String USER_LOGIN_PHONENUMBER = "#user/login/phonenumber";

    // 检查token 是否过期
    String USER_TOKEN_CHECK = "#user/token/check";
    // 刷新TOKEN
    String USER_TOKEN_REFRESH = "#user/token/refresh";


}
