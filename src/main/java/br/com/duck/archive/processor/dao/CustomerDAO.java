package br.com.duck.archive.processor.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import br.com.duck.archive.processor.model.Customer;

public class CustomerDAO {

	private static List<Customer> customers = new CopyOnWriteArrayList<>();

	public static void add(Customer customer) {
		customers.add(customer);
	}

	public static List<Customer> getCustomers() {
		return customers;
	}
}
