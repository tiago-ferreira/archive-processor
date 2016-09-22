package br.com.duck.archive.processor.model.test;

import java.math.BigDecimal;

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
	
//	@Test
//	public void testSalesmanItem() {
//		SalesItem salesItem = new SalesItem(1L, 10, new BigDecimal(1.99));
//		sales.salesItem(salesItem);
//		Assert.assertEquals(salesItem, sales.salesItem());
//	}
	
	@Test
	public void testCustomer() {
		Salesman salesman = new Salesman(LayoutType.SALESMAN, "19231673581212", "Josias", new BigDecimal(6000));
		sales.salesman(salesman);
		Assert.assertEquals(salesman, sales.salesman());
	}
	
	
}
