package com.example.Capstone.phase2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Capstone.phase2.entities.Account;
import com.example.Capstone.phase2.entities.Customer;
import com.example.Capstone.phase2.entities.FundTransfer;
import com.example.Capstone.phase2.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@PostMapping("/customers")
	public Customer AddCustomers(@RequestBody Customer c) {
		Customer cu = cs.insertCustomer(c);
		return cu;
	}

	@PostMapping("/customers/{id}/accounts")
	public Customer addAnAccountToCustomer(@PathVariable int id, @RequestBody Account acc) {
		Customer c = cs.insertAnAccountToCustomer(id, acc);
		return c;
	}

	@PutMapping("/customers/{id}")
	public Customer EditCustomerDetails(@PathVariable int id, @RequestBody Customer c) {

		Customer cu = cs.updateCustomer(id, c);
		return cu;
	}

	@GetMapping("/customers/{id}/accounts")
	public Customer getCustomerByIdWithAccounts(@PathVariable int id) {
		Customer c = cs.getACustomer(id);
		return c;

	}

	@GetMapping("/customers/accounts")
	public List<Customer> getAllCustomerswithAccounts() {
		List<Customer> customers = cs.getCustomers();
		return customers;
	}

	@PutMapping("/accounts/FundTransfer")
	public String TransferOfFunds(@RequestBody FundTransfer f) {
		String s = cs.FundTransfer(f);
		return s;
	}
}
