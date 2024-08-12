package com.telusko.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.telusko.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorController {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotfoundException(TouristNotFoundException tnf){
		
		ErrorDetails err=new ErrorDetails("404 Not Found",tnf.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleExceptionGlobally(Exception e){

		ErrorDetails err=new ErrorDetails("500 server",e.getMessage(),LocalDateTime.now());		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
