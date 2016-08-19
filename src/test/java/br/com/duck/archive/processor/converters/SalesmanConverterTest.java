package br.com.duck.archive.processor.converters;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Salesman;

public class SalesmanConverterTest {
    
    @Test
    public void testConvertStringInSalesman() {

        String value = "3245678865434çRenatoç40000";
        SalesmanConverter instance = new SalesmanConverter();
        String document = "3245678865434";
        String name = "Renato";
        BigDecimal salary = new BigDecimal("40000");
        Salesman result = instance.converter(value);
        Assert.assertEquals(document, result.document());
        Assert.assertEquals(name, result.name());
        Assert.assertEquals(salary, result.salary());
    }

}
