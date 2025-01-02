package com.wipro.Capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.dao.AccountDao;
import com.wipro.Capstone.entities.Account;
import com.wipro.Capstone.exceptions.AccountOrCustomerNotFoundException;

@Service
public class AccountService {
	@Autowired
	private AccountDao dao;

	public List<Account> displayAllAccounts() {
		return dao.displayAllAccounts();

	}

	public Account findanAccount(long accno) {
		Account ac =  dao.findAccount(accno);
		if(ac==null) {
			throw new AccountOrCustomerNotFoundException("Account is not found with the specified account number");
		}
		return ac;

	}

	public Account saveAccount(Account ac) {
		return dao.saveAccount(ac);

	}

	public Account updateAccount(long accno, Account a) {
		Account ac = dao.updateAccount(accno, a);
		if(ac==null) {
			throw new AccountOrCustomerNotFoundException("Account is not found with the specified account number");
		}
		return ac;

	}

	public Account deleteAccount(long accno) {
		Account ac = dao.deleteAccount(accno);
		if(ac==null) {
			throw new AccountOrCustomerNotFoundException("Account is not found with the specified account number");
		}
		return ac;

	}

}
