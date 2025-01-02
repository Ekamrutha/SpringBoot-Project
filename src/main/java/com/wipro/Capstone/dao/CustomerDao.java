package com.wipro.Capstone.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.Capstone.entities.Customer;

@Repository
public class CustomerDao {
	private static ArrayList<Customer> customers = new ArrayList<Customer>();
	static {
		customers.add(new Customer(100, "John", "Finney", "john65@gmail.com"));
		customers.add(new Customer(200, "Tom", "Joseph", "joseph122@gmail.com"));
		customers.add(new Customer(300, "Raju", "Ravula", "prince65@gmail.com"));
	}

	public List<Customer> displayallCustomers() {

		return customers;

	}

	public Customer findaCustomer(int cid) {
		Customer existingCustomer = null;
		for (Customer cu : customers) {
			if (cu.getCustomerId() == cid) {
				existingCustomer = cu;
				break;
			}
		}
		return existingCustomer;

	}

	public Customer AddCustomer(Customer c) {
		customers.add(c);
		return c;

	}

	public Customer UpdateCustomer(int cid, Customer c) {
		Customer updateCustomer = null;
		Iterator<Customer> it = customers.iterator();
		while (it.hasNext()) {
			Customer cu = it.next();
			if (cu.getCustomerId() == cid) {
				cu.setFirstname(c.getFirstname());
				cu.setLastname(c.getLastname());
				cu.setCustomerEmail(c.getCustomerEmail());
				updateCustomer = cu;
				break;
			}
		}
		return updateCustomer;

	}

	public Customer deleteCustomer(int cid) {
		Customer deleteCustomer = null;
		Iterator<Customer> it = customers.iterator();
		while (it.hasNext()) {
			Customer cus = it.next();
			if (cus.getCustomerId() == cid) {
				deleteCustomer = cus;
				it.remove();
				break;
			}

		}
		return deleteCustomer;

	}

}
