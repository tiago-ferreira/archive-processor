package br.com.duck.archive.processor.util.test;

import org.junit.Test;

import br.com.duck.archive.processor.util.ConverterSelector;

public class ConverterSelectorTest {

    ConverterSelector converterSelector = new ConverterSelector();
    
    @Test(expected=NullPointerException.class)
    public void testSelectConverter() {
        converterSelector.selectConverter(null);
    }
}
