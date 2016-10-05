package br.com.duck.archive.processor.util;

import br.com.duck.archive.processor.converters.LineConverter;
import br.com.duck.archive.processor.types.LayoutType;

public class ConverterSelector {
	
	private  LineConverter converter;

	 public void selectConverter(String string) {
	        int type = Integer.parseInt(string.substring(0, 3));
	        String line = "";
	        if (type == LayoutType.SALESMAN.getCode()) {
	            line = string.substring(4, string.length());
	        } else if (type ==  LayoutType.CUSTOMER.getCode()) {
	            line = string.substring(4, string.length());
	        } else if (type ==  LayoutType.SALES.getCode()) {
	            line = string.substring(4, string.length());
	        } else {
	            System.err.println("Type of data not suported :-<");
	        }
	    }
}
