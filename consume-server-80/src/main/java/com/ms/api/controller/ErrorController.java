package com.ms.api.controller;

import com.ms.common.ErrorCodeParse;
import com.ms.common.ErrorResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ErrorController {
    private static final Logger log = LogManager.getLogger(ErrorController.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResult systemException(MethodArgumentNotValidException e) {
        String fieldStr = e.getBindingResult().getFieldError().getField().toString();
        Integer fieldCode = ErrorCodeParse.getInstance().parse(fieldStr);
        return ErrorResult.builder().code(fieldCode).message(fieldStr + " null").build();
    }
}