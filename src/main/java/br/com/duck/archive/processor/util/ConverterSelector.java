package br.com.duck.archive.processor.util;

import br.com.duck.archive.processor.converters.CustomerConverter;
import br.com.duck.archive.processor.converters.SalesConverter;
import br.com.duck.archive.processor.converters.SalesmanConverter;
import br.com.duck.archive.processor.dao.CustomerDAO;
import br.com.duck.archive.processor.dao.SalesDAO;
import br.com.duck.archive.processor.dao.SalesmanDAO;
import br.com.duck.archive.processor.types.LayoutType;

public class ConverterSelector {
	

	 public void selectConverter(String string) {
	        int type = Integer.parseInt(string.substring(0, 3));
	        if (type == LayoutType.SALESMAN.getCode()) {
	            addSalesman(string);
	        } else if (type ==  LayoutType.CUSTOMER.getCode()) {
	            addCustomer(string);
	        } else if (type ==  LayoutType.SALES.getCode()) {
	            addSales(string);
	        } else {
	            System.err.println("Type of data not suported :-<");
	        }
	    }

	private void addSales(String string) {
		String line;
		line = string.substring(4, string.length());
		SalesDAO.add(new SalesConverter().converter(line));
	}

	private void addCustomer(String string) {
		String line;
		line = string.substring(4, string.length());
		CustomerDAO.add(new CustomerConverter().converter(line));
	}

	private void addSalesman(String string) {
		String line;
		line = string.substring(4, string.length());
		SalesmanDAO.add(new SalesmanConverter().converter(line));
	}
}
