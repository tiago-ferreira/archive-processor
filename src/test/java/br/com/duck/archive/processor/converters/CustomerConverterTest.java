package br.com.duck.archive.processor.converters;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.model.Customer;

public class CustomerConverterTest {

    
    @Test
    public void testConverter() {
        String line = "2345675434544345çJose da SilvaçRural";
        CustomerConverter instance = new CustomerConverter();
        String name = "Jose da Silva";
        String document = "2345675434544345";
        String businessArea = "Rural";
        Customer result = instance.converter(line);
        Assert.assertEquals(name, result.name());
        Assert.assertEquals(document, result.document());
        Assert.assertEquals(businessArea, result.businessArea());
    }
}
