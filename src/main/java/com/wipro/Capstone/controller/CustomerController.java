package com.wipro.Capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Capstone.entities.Customer;
import com.wipro.Capstone.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getallCustomers() {
		return service.displayAllCustomers();

	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> fetchaCustomer(@PathVariable("id") int Customerid) {
		Customer c = service.findaCustomer(Customerid);
		return new ResponseEntity<Customer>(c, HttpStatus.OK);

	}

	@PostMapping("/customers")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c) {
		Customer cu = service.addCustomer(c);
		return new ResponseEntity<Customer>(cu, HttpStatus.CREATED);
	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer c) {
		Customer cu = service.updateCustomer(id, c);
		return new ResponseEntity<Customer>(cu, HttpStatus.OK);

	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id) {
		Customer c = service.deleteCustomer(id);
		return new ResponseEntity<Customer>(c, HttpStatus.OK);

	}
}
