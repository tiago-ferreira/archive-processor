package br.com.duck.archive.processor.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Salesman;

public class SalesmanDAOTest {

	@Test
	public void testAddGet() {
		SalesmanDAO.add(new Salesman());
		SalesmanDAO.add(new Salesman());
		SalesmanDAO.add(new Salesman());
		List<Salesman> salesmans = SalesmanDAO.getSalesmans();
		Assert.assertNotNull(salesmans);
		Assert.assertTrue(salesmans.size() == 3);
		Assert.assertTrue(salesmans == SalesmanDAO.getSalesmans());
	}
}
