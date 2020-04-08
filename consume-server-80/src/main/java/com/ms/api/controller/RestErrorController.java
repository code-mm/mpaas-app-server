package com.ms.api.controller;

import com.ms.common.error.AppError;
import com.ms.common.error.ErrorCodeParse;
import com.ms.common.error.ApiError;
import com.ms.common.exception.AppRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
@Slf4j
public class RestErrorController extends ResponseEntityExceptionHandler {


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        String defaultMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        AppError appError = ErrorCodeParse.getInstance().parse(defaultMessage);
        ApiError apiError = ApiError.builder().code(appError.getCode()).message("filure").error(appError.getCnErr()).build();
        return handleExceptionInternal(ex, apiError, headers, status, request);
    }


    @Override
    protected ResponseEntity<Object> handleBindException(final BindException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        String defaultMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        AppError appError = ErrorCodeParse.getInstance().parse(defaultMessage);
        ApiError apiError = ApiError.builder().code(appError.getCode()).message("filure").error(appError.getCnErr()).build();
        return handleExceptionInternal(ex, apiError, headers, status, request);
    }


    @ExceptionHandler(AppRuntimeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleAppRuntimeException(final AppRuntimeException ex) {
        String fieldStr = ex.getMessage();
        AppError appError = ErrorCodeParse.getInstance().parse(fieldStr);
        ApiError apiError = ApiError.builder().code(appError.getCode()).message("filure").error(appError.getCnErr()).build();
        return apiError;
    }
}