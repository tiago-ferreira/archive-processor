package br.com.duck.archive.processor.types;

import org.junit.Assert;
import org.junit.Test;



public class LayoutTypeTest {

	@Test
	public void testValues() {
		Assert.assertTrue(LayoutType.values()[0] == LayoutType.CUSTOMER);
		Assert.assertTrue(LayoutType.values()[1] == LayoutType.SALES);
		Assert.assertTrue(LayoutType.values()[2] == LayoutType.SALESMAN);
	}
	
	@Test
	public void testValueOf() {
		Assert.assertTrue(LayoutType.valueOf("CUSTOMER") == LayoutType.CUSTOMER);
		Assert.assertTrue(LayoutType.valueOf("SALES") == LayoutType.SALES);
		Assert.assertTrue(LayoutType.valueOf("SALESMAN") == LayoutType.SALESMAN);
	}
}
