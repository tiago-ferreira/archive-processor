package br.com.duck.archive.processor.model.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Customer;
import br.com.duck.archive.processor.types.LayoutType;

public class CustomerTest {

	Customer customer = new Customer();

	@Test
	public void testLayoutType() {
		customer.layout(LayoutType.CUSTOMER);
		Assert.assertEquals(LayoutType.CUSTOMER, customer.layout());
	}

	@Test
	public void testDocument() {
		customer.document("10441092000107");
		Assert.assertEquals("10441092000107", customer.document());
	}

	@Test
	public void testName() {
		customer.name("Ferreira");
		Assert.assertEquals("Ferreira", customer.name());
	}

	@Test
	public void testBusinessArea() {
		customer.businessArea("Tecnoligia da Informacao");
		Assert.assertEquals("Tecnoligia da Informacao", customer.businessArea());
	}
	
	@Test
	public void testCustomerConstructor() {
		customer = new Customer(LayoutType.CUSTOMER, "19231673581", "Jose", "Vendor");
		Assert.assertEquals(customer.layout(), LayoutType.CUSTOMER);
		Assert.assertEquals(customer.document(), "19231673581");
		Assert.assertEquals(customer.name(), "Jose");
		Assert.assertEquals(customer.businessArea(), "Vendor");
	}
}
