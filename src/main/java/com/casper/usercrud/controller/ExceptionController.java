package com.casper.usercrud.controller;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ExceptionController {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgumentException() {
        log.info("API error {}", IllegalArgumentException.class);
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleInternalException(Exception exception) {
        log.error("Internal server error", exception);
        return ResponseEntity.status(INTERNAL_SERVER_ERROR).build();
    }

}
