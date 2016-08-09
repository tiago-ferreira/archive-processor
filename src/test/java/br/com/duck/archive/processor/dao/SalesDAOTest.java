package br.com.duck.archive.processor.dao;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Sales;

public class SalesDAOTest {
	
	@Test
	public void testAddGet() {
		SalesDAO.add(new Sales());
		SalesDAO.add(new Sales());
		SalesDAO.add(new Sales());
		List<Sales> sales = SalesDAO.getSales();
		Assert.assertNotNull(sales);
		Assert.assertTrue(sales.size() == 3);
	}
}
