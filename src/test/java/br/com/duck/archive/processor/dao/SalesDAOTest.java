package br.com.duck.archive.processor.dao;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Sales;

public class SalesDAOTest {
	
	SalesDAO salesDAO = new SalesDAO();
	
	@Test
	public void testAddGet() {
		salesDAO.add(new Sales());
		salesDAO.add(new Sales());
		salesDAO.add(new Sales());
		List<Sales> sales = salesDAO.getSales();
		Assert.assertNotNull(sales);
		Assert.assertTrue(sales.size() == 3);
	}
}
