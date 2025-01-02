package com.example.Capstone.phase2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Capstone.phase2.entities.Account;
import com.example.Capstone.phase2.repositories.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository arp;

	public List<Account> getAllAccounts() {
		Iterable<Account> accnts = arp.findAll();
		return (List<Account>) accnts;
	}

	public Account getAnAccount(int id) {
		Optional<Account> acc = arp.findById(id);
		Account a = acc.get();
		return a;
	}

}
