package br.com.duck.archive.processor.converters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.SalesItem;
import br.com.duck.archive.processor.model.Salesman;

public class SalesConverterTest {

    @Test
    public void testConvertStringInSales() {
        System.out.println("convertStringInSales");
        String value = "08ç[1-34-10,2-33-1.50,3-40-0.10]çRenato";
        SalesConverter instance = new SalesConverter();
        Sales expResult = new Sales(8L, getSalesItems(), new Salesman("Renato"));
        Sales result = instance.converter(value);
        Assert.assertEquals(expResult.id(), result.id());
        Assert.assertEquals(expResult.salesItem().get(0).id(), result.salesItem().get(0).id());
        Assert.assertEquals(expResult.salesItem().get(1).id(), result.salesItem().get(1).id());
        Assert.assertEquals(expResult.salesItem().get(2).id(), result.salesItem().get(2).id());
        Assert.assertEquals(expResult.salesman().name(), result.salesman().name());
    }
    
    
    private List<SalesItem> getSalesItems(){
        List<SalesItem> SalesItems = new ArrayList<>();
        SalesItem SalesItem1 = new SalesItem(1L,34,new BigDecimal("10"));
        SalesItem SalesItem2 = new SalesItem(2L,33,new BigDecimal("1.50"));
        SalesItem SalesItem3 = new SalesItem(3L,40,new BigDecimal("0.10"));
        SalesItems.add(SalesItem1);
        SalesItems.add(SalesItem2);
        SalesItems.add(SalesItem3);
        return SalesItems;
    }
}
