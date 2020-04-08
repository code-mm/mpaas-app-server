package com.ms.api.controller;

import com.ms.common.error.AppError;
import com.ms.common.error.ErrorCodeParse;
import com.ms.common.error.ApiError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class RestErrorController extends ResponseEntityExceptionHandler {
    private static final Logger log = LogManager.getLogger(RestErrorController.class);

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        logger.info(ex.getClass().getName());

        String fieldStr = ex.getBindingResult().getFieldError().getField().toString();
        AppError appError = ErrorCodeParse.getInstance().parse(fieldStr);

        final List<String> errors = new ArrayList<>();
        errors.add(ErrorCodeParse.getInstance().parse(fieldStr).getCnErr());

        ApiError apiError = ApiError.builder().code(appError.getCode()).message(appError.getCnErr()).build();
        return handleExceptionInternal(ex, apiError, headers, status, request);
    }
}