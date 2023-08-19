package com.example.demo.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		List<FieldError> list = ex.getFieldErrors();

		for (FieldError fe : list) {
			System.err.println(fe.getField() + ":" + fe.getDefaultMessage() + ":" + fe.getRejectedValue());
		}

		ErrorDetails details = new ErrorDetails(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), LocalDateTime.now());

		return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
	}
}
