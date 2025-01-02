package com.example.Capstone.phase2.services;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Capstone.phase2.entities.*;

import com.example.Capstone.phase2.exceptions.CustomerNotFoundException;
import com.example.Capstone.phase2.repositories.AccountRepository;
import com.example.Capstone.phase2.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository crp;
	@Autowired
	private AccountRepository arp;

	public List<Customer> getCustomers() {
		Iterable<Customer> customers = crp.findAll();
		return (List<Customer>) customers;

	}

	public Customer getACustomer(int id) {
		Customer c = null;
		Optional<Customer> customers = crp.findById(id);
		c = customers.get();
		if (c == null)
			throw new CustomerNotFoundException("Customer doesn't exists");
		return c;

	}

	public Customer insertCustomer(Customer c) {
		Customer cu = crp.save(c);
		return cu;

	}

	public Customer insertAnAccountToCustomer(int id, Account acc) {
		Customer c = null;
		Optional<Customer> customers = crp.findById(id);
		c = customers.get();
		if (c == null) {
			throw new CustomerNotFoundException("Customer doesn't exists");
		} else {
			arp.save(acc);
			HashSet<Account> accnts = new HashSet<Account>();
			accnts.add(acc);
			c.setAccnts(accnts);
			acc.setCustomer(c);
		}
		return crp.save(c);
	}

	@Transactional
	public String FundTransfer(FundTransfer f) {
		String st = null;
		Optional<Account> accnts = arp.findById(f.getFromaccno());
		Account fromacc = accnts.get();
		Optional<Account> accounts = arp.findById(f.getToaccno());
		Account toacc = accounts.get();

		if (f.getFromaccno() != f.getToaccno() && f.getAmt() > 0) {
			if (fromacc.getBal() < f.getAmt()) {
				st = "Insufficient balance";
			} else {
				fromacc.setBal(fromacc.getBal() - f.getAmt());
				toacc.setBal(toacc.getBal() + f.getAmt());
				st = "Success";
			}
		} else {
			st = "From and To acccounts are same or entered amount is less than Zero, please check the input";
		}
		return st;
	}

	public Customer updateCustomer(int id, Customer c) {
		Customer cu = null;
		Optional<Customer> customers = crp.findById(id);
		cu = customers.get();
		if (cu == null)
			throw new CustomerNotFoundException("Customer doesn't Exists");
		else {
			cu.setFirstname(c.getFirstname());
			cu.setLastname(c.getLastname());
			cu.setCustomerEmail(c.getCustomerEmail());
		}
		return crp.save(cu);

	}

	public Customer deleteCustomer(int id) {
		Optional<Customer> Customers = crp.findById(id);
		Customer c = Customers.get();
		crp.delete(c);
		return c;
	}
}
