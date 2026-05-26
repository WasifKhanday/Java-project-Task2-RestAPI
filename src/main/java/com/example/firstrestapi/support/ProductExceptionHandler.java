package com.example.firstrestapi.support;

import com.example.firstrestapi.shared.api.response.ErrorMessageResponse;
import com.example.firstrestapi.support.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFound(
            ProductNotFoundException exception) {

        ErrorMessageResponse response =
                new ErrorMessageResponse(exception.getMessage());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}