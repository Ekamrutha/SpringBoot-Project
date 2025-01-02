package com.wipro.Capstone.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountOrCustomerNotFoundException extends RuntimeException {

	public AccountOrCustomerNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
