package br.com.duck.archive.processor.dao;

import java.util.List;

import org.junit.Assert;

import org.junit.Test;

import br.com.duck.archive.processor.model.Customer;

public class CustomerDAOTest {

	@Test
	public void testAddGet() {
		CustomerDAO.add(new Customer());
		CustomerDAO.add(new Customer());
		CustomerDAO.add(new Customer());
		List<Customer> customers = CustomerDAO.getCustomers();
		Assert.assertNotNull(customers);
		Assert.assertTrue(customers.size() == 3);
		Assert.assertTrue(customers == CustomerDAO.getCustomers());
	}
}
