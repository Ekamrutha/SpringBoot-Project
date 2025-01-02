package com.wipro.Capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Capstone.entities.Account;
import com.wipro.Capstone.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService service;

	@GetMapping("/accounts")
	public List<Account> getAccounts() {

		return service.displayAllAccounts();

	}

	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
	public ResponseEntity<Account> getaccountbyid(@PathVariable("id") long accno) {
		Account a = service.findanAccount(accno);
		ResponseEntity<Account> re = new ResponseEntity<Account>(a, HttpStatus.OK);
		return re;

	}

	@PostMapping("/accounts")
	public ResponseEntity<Account> saveAccount(@RequestBody Account acc) {
		Account a = service.saveAccount(acc);
		ResponseEntity<Account> re = new ResponseEntity<Account>(a, HttpStatus.CREATED);
		return re;

	}

	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Account> updateAccount(@PathVariable("id") long accno, @RequestBody Account a) {
		Account ac = service.updateAccount(accno, a);
		ResponseEntity<Account> re = new ResponseEntity<Account>(ac, HttpStatus.OK);
		return re;

	}

	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Account> deleteAccount(@PathVariable("id") long acno) {
		Account a = service.deleteAccount(acno);
		ResponseEntity<Account> re = new ResponseEntity<Account>(a, HttpStatus.OK);
		return re;

	}
}
