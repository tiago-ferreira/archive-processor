package br.com.duck.archive.processor.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import br.com.duck.archive.processor.model.Customer;

public class CustomerDAO {

	private List<Customer> customers = new CopyOnWriteArrayList<>();

	public void add(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> getCustomers() {
		return customers;
	}
}
