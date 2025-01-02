package com.wipro.Capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.dao.CustomerDao;
import com.wipro.Capstone.entities.Customer;
import com.wipro.Capstone.exceptions.AccountOrCustomerNotFoundException;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;

	public List<Customer> displayAllCustomers() {
		return dao.displayallCustomers();

	}

	public Customer findaCustomer(int id) {
		Customer c = dao.findaCustomer(id);
		if (c == null) {
			throw new AccountOrCustomerNotFoundException("Customer not found with the specified id");
		}
		return c;

	}

	public Customer addCustomer(Customer c) {
		return dao.AddCustomer(c);

	}

	public Customer updateCustomer(int id, Customer c) {
		Customer cu = dao.UpdateCustomer(id, c);
		if (cu == null) {
			throw new AccountOrCustomerNotFoundException("Customer not found with the specified id");
		}
		return cu;
	}

	public Customer deleteCustomer(int id) {
		Customer c = dao.deleteCustomer(id);
		if (c == null) {
			throw new AccountOrCustomerNotFoundException("Customer not found with the specified id");
		}
		return c;
	}

}
