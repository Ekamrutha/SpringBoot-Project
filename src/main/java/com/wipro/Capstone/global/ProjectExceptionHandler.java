package com.wipro.Capstone.global;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.Capstone.exceptions.AccountOrCustomerNotFoundException;

@RestControllerAdvice
public class ProjectExceptionHandler {

	@ExceptionHandler(AccountOrCustomerNotFoundException.class)
	public ResponseEntity<UserCustomError> handleglobalexceptions(AccountOrCustomerNotFoundException ex) {
		UserCustomError er = new UserCustomError();
		er.setTimestamp(LocalDateTime.now());
		er.setErrorStatusCode(HttpStatus.NOT_FOUND.value());
		er.setErrorStatusMsg(HttpStatus.NOT_FOUND.toString());
		er.setMsg(ex.getMessage());
		return new ResponseEntity<UserCustomError>(er, HttpStatus.NOT_FOUND);

	}

}
