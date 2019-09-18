package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import com.kmd.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Michelle");
		customer.setLastName("Pascal");

		customers.add(customer);
		return customers;
	}
}