package com.wipro.Capstone.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.Capstone.entities.Account;
import com.wipro.Capstone.entities.Account_type;

@Repository
public class AccountDao {
	private static ArrayList<Account> acc = new ArrayList<Account>();
	static {
		acc.add(new Account(327101001, Account_type.SAVINGS, 20000));
		acc.add(new Account(327101002, Account_type.CURRENT, 67000));
		acc.add(new Account(327101003, Account_type.SAVINGS, 85000));
		acc.add(new Account(327101004, Account_type.CURRENT, 190000));
	}

	public List<Account> displayAllAccounts() {
		return acc;
	}

	public Account findAccount(long accountno) {
		Account existingAccount = null;
		for (Account ac : acc) {
			if (ac.getAccountno() == accountno) {
				existingAccount = ac;
				break;
			}
		}
		return existingAccount;

	}

	public Account saveAccount(Account a) {
		acc.add(a);
		return a;

	}

	public Account updateAccount(long accountno, Account a) {
		Account updateAccount = null;
		for (Account ac : acc) {
			if (ac.getAccountno() == accountno) {
				ac.setAcctype(a.getAcctype());
				ac.setBal(a.getBal());
				updateAccount = ac;
				break;
			}
			
		}
		return updateAccount;

	}

	public Account deleteAccount(long accountno) {
		Account deleteAccount = null;
		Iterator<Account> it = acc.iterator();
		while (it.hasNext()) {
			Account ac = it.next();
			if (ac.getAccountno() == accountno) {
				deleteAccount = ac;
				it.remove();
				break;
			}
		}
		return deleteAccount;

	}
}
