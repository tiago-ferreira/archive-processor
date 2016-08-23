package br.com.duck.archive.processor.converters;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.SalesItem;

public class SalesItemConverterTest {

	   @Test
	    public void testConvertStringInSalesItems() {
	        System.out.println("convertStringInSalesItems");
	        String value = "[1-10-100,2-30-2.50,3-40-3.10]";
	        SalesItemConverter instance = new SalesItemConverter();
	        SalesItem it = new SalesItem(1L, 10, new BigDecimal(100));
	        List<SalesItem> result = instance.convertStringInSalesItems(value);
	        Assert.assertEquals(it.id(), result.get(0).id());
	        Assert.assertEquals(it.numberOfItems(), result.get(0).numberOfItems());
	        Assert.assertEquals(it.price(), result.get(0).price());
	    }

	    @Test
	    public void testConvertStringWithOneSalesItemInSalesItems() {
	        System.out.println("convertStringInSalesItems");
	        String value = "[1-10-100]";
	        SalesItemConverter instance = new SalesItemConverter();
	        SalesItem it = new SalesItem(1L, 10, new BigDecimal(100));
	        List<SalesItem> result = instance.convertStringInSalesItems(value);
	        Assert.assertEquals(it.id(), result.get(0).id());
	        Assert.assertEquals(it.numberOfItems(), result.get(0).numberOfItems());
	        Assert.assertEquals(it.price(), result.get(0).price());
	    }

	    /**
	     * Test of convertStringInSalesItem method, of class SalesItemConverter.
	     */
	    @Test
	    public void testConvertStringInSalesItem() {
	        System.out.println("convertStringInSalesItem");
	        String value = "1-10-100";
	        SalesItemConverter instance = new SalesItemConverter();
	        SalesItem expResult =new SalesItem(1L, 10, new BigDecimal(100));
	        SalesItem result = instance.convertStringInSalesItem(value);
	        Assert.assertEquals(expResult.id(), result.id());
	        Assert.assertEquals(expResult.numberOfItems(), result.numberOfItems());
	        Assert.assertEquals(expResult.price(), result.price());
	    }
}
