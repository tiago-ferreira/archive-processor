package br.com.duck.archive.processor.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Salesman;

public class SalesmanDAOTest {

	private SalesmanDAO salesmanDAO = new SalesmanDAO();
	
	@Test
	public void testAddGet() {
		salesmanDAO.add(new Salesman());
		salesmanDAO.add(new Salesman());
		salesmanDAO.add(new Salesman());
		List<Salesman> salesmans = salesmanDAO.getSalesmans();
		Assert.assertNotNull(salesmans);
		Assert.assertTrue(salesmans.size() == 3);
		Assert.assertTrue(salesmans == salesmanDAO.getSalesmans());
	}
}
