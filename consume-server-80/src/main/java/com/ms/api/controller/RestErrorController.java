//package com.ms.api.controller;
//
//import com.ms.common.ErrorCodeParse;
//import com.ms.common.ErrorResult;
//import com.ms.common.exception.MyException;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.HttpRequestMethodNotSupportedException;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//
//@RestControllerAdvice
//public class RestErrorController {
//    private static final Logger log = LogManager.getLogger(RestErrorController.class);
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseBody
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ErrorResult systemException(MethodArgumentNotValidException e, HttpServletRequest request) {
//        log.info("MethodArgumentNotValidException" +request);
//        String fieldStr = e.getBindingResult().getFieldError().getField().toString();
//        Integer fieldCode = ErrorCodeParse.getInstance().parse(fieldStr);
//        return ErrorResult.builder().code(fieldCode).message(fieldStr + " null").build();
//    }
//
//    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//
//    public ResponseEntity handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
//        log.error("不支持的方法：{}", e.getMessage());
//        return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
//    }
//
//    @ExceptionHandler(MyException.class)
//
//    public ResponseEntity handleHttpRequestMethodNotSupportedException(MyException e) {
//        log.error("不支持的方法：{}", e.getMessage());
//        return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
//    }
//}