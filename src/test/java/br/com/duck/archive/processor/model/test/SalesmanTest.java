package br.com.duck.archive.processor.model.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Salesman;
import br.com.duck.archive.processor.types.LayoutType;

public class SalesmanTest {

	Salesman salesman = new Salesman();
	
	@Test
	public void testLayout() {
		salesman.layout(LayoutType.SALESMAN);
		Assert.assertEquals(LayoutType.SALESMAN, salesman.layout());
	}
	
	@Test
	public void testName() {
		salesman.name("Tiago");
		Assert.assertEquals("Tiago", salesman.name());
	}
	
	@Test
	public void testDocument() {
		salesman.document("10831583611");
		Assert.assertEquals("10831583611", salesman.document());
	}
	
	@Test
	public void testSalary() {
		salesman.salary(new BigDecimal(6000));
		Assert.assertEquals(new BigDecimal(6000), salesman.salary());
	}
	
	@Test
	public void testSalesmanConstructorWithFourParameters() {
		salesman = new Salesman(LayoutType.SALESMAN, "19231673581212", "Josias", new BigDecimal(6000));
		Assert.assertEquals(salesman.layout(), LayoutType.SALESMAN);
		Assert.assertEquals(salesman.document(), "19231673581212");
		Assert.assertEquals(salesman.name(), "Josias");
		Assert.assertEquals(salesman.salary(), new BigDecimal(6000));
	}
	
	@Test
	public void testSalesmanConstructorWithThreeParameters() {
		salesman = new Salesman("19231673581212", "Josias", new BigDecimal(6000));
		Assert.assertEquals(salesman.document(), "19231673581212");
		Assert.assertEquals(salesman.name(), "Josias");
		Assert.assertEquals(salesman.salary(), new BigDecimal(6000));
	}
}
