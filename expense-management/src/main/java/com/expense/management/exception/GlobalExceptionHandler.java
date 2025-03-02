package com.expense.management.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleException(Exception e) {
	        return ResponseEntity.status(500).body("Internal Server Error: " + e.getMessage());
	    }

}
