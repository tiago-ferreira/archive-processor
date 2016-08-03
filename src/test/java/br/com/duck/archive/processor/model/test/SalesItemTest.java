package br.com.duck.archive.processor.model.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.SalesItem;

public class SalesItemTest {

	SalesItem salesItem = new SalesItem();
	
	@Test
	public void testId() {
		salesItem.id(1L);
		Assert.assertTrue(salesItem.id() == 1L);
	}
	
	@Test
	public void testNumberOdItems() {
		salesItem.numberOfItems(4);
		Assert.assertTrue(salesItem.numberOfItems() == 4);
	}
	
	@Test
	public void testPrice() {
		salesItem.price(new BigDecimal(50.0));
		Assert.assertEquals(new BigDecimal(50.0), salesItem.price());
	}
	
	@Test
	public void testConstructorSalesItem() {
		salesItem = new SalesItem(1L, 10, new BigDecimal(1.99));
		Assert.assertTrue(salesItem.id() == 1L);
		Assert.assertTrue(salesItem.numberOfItems() == 10);
		Assert.assertEquals(new BigDecimal(1.99), salesItem.price());
	}
}
