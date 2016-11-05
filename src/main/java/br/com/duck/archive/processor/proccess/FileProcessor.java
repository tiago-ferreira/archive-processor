package br.com.duck.archive.processor.proccess;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.stream.Stream;

import br.com.duck.archive.processor.business.SalesBusiness;
import br.com.duck.archive.processor.dao.CustomerDAO;
import br.com.duck.archive.processor.dao.SalesDAO;
import br.com.duck.archive.processor.dao.SalesmanDAO;
import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.Salesman;
import br.com.duck.archive.processor.util.ConverterSelector;
import br.com.duck.archive.processor.util.FileReader;

public class FileProcessor {
	
	FileReader fileReader = new FileReader();
	ConverterSelector converter = new ConverterSelector();
	
	public void startProcess() {
		try {
			Stream<String> contentsOfFile = fileReader.readFile("/home/tiago/bagacera.dat", false);
			contentsOfFile.forEach( a -> converter.selectConverter(a));
			Sales mostExpensiveSale = SalesBusiness.getMostExpensiveSale();
			BigDecimal amountOfSales = SalesBusiness.amountOfSales();
			Salesman worseSalesmanEver = SalesBusiness.worseSalesmanEver();
			System.out.println("Worse Salesman: "+worseSalesmanEver.name());
			System.out.println("Most expensive Sale: "+mostExpensiveSale.getTotalOfSale());
			System.out.println("Amount of Sales: "+amountOfSales);
			System.out.println("Number of customers: "+CustomerDAO.getCustomers().size());
			System.out.println("Number Salesmans: "+SalesmanDAO.getSalesmans().size());
			System.out.println("Number of Sales: "+SalesDAO.getSales().size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
