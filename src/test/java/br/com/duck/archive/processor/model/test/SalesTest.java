package br.com.duck.archive.processor.model.test;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.SalesItem;
import br.com.duck.archive.processor.model.Salesman;
import br.com.duck.archive.processor.types.LayoutType;

public class SalesTest {
	
	private Sales sales = new Sales();

	@Test
	public void testLayout() {
		sales.layout(LayoutType.SALES);
		Assert.assertEquals(LayoutType.SALES, sales.layout());
	}
	
	@Test
	public void testId() {
		sales.id(1L);
		Assert.assertTrue(sales.id() == 1L);
	}
	
	@Test
	public void testSalesmanItem() {
		SalesItem salesItem = new SalesItem(1L, 10, new BigDecimal(1.99));
		sales.salesItem(Arrays.asList(salesItem));
		Assert.assertEquals(salesItem, sales.salesItem().get(0));
	}
	
	@Test
	public void testSalesConstruct() {
		SalesItem salesItem = new SalesItem(1L, 10, new BigDecimal(1.99));
		Sales s = new Sales(1L, Arrays.asList(salesItem), new Salesman("Tiago"));
		Assert.assertTrue(s.id() == 1L);
		Assert.assertEquals(s.salesman().name(), "Tiago");
		Assert.assertTrue(s.salesItem().size() > 0);
	}
	
	@Test
	public void testCustomer() {
		Salesman salesman = new Salesman(LayoutType.SALESMAN, "19231673581212", "Josias", new BigDecimal(6000));
		sales.salesman(salesman);
		Assert.assertEquals(salesman, sales.salesman());
	}
	
	
}
