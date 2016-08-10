package br.com.duck.archive.processor.dao;

import java.util.List;

import org.junit.Assert;

import org.junit.Test;

import br.com.duck.archive.processor.model.Customer;

public class CustomerDAOTest {

	private CustomerDAO customerDAO = new CustomerDAO();
	
	@Test
	public void testAddGet() {
		customerDAO.add(new Customer());
		customerDAO.add(new Customer());
		customerDAO.add(new Customer());
		List<Customer> customers = customerDAO.getCustomers();
		Assert.assertNotNull(customers);
		Assert.assertTrue(customers.size() == 3);
		Assert.assertTrue(customers == customerDAO.getCustomers());
	}
}
