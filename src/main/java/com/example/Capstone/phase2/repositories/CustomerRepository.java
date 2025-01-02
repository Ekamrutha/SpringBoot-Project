package com.example.Capstone.phase2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.Capstone.phase2.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
