package com.example.Capstone.phase2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Capstone.phase2.entities.Account;
import com.example.Capstone.phase2.services.AccountService;
@RestController
public class AccountController {
	@Autowired
	private AccountService as;

	@GetMapping("/accounts")
	public List<Account> getAllAccounts() {
		List<Account> allAccounts = as.getAllAccounts();
		return allAccounts;
	}

	@GetMapping("/accounts/{id}")
	public Account getAccount(@PathVariable int id) {
		Account a = as.getAnAccount(id);
		return a;
	}
}
