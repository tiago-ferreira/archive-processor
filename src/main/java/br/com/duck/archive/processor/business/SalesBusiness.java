package br.com.duck.archive.processor.business;

import java.math.BigDecimal;

import br.com.duck.archive.processor.dao.SalesDAO;
import br.com.duck.archive.processor.dao.SalesmanDAO;
import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.Salesman;

public class SalesBusiness {

	public Salesman worseSalesmanEver() {
        Salesman worseSalesman = SalesmanDAO.getSalesmans().get(0);

        return worseSalesman;
	}
	
	
    public static Sales getMostExpensiveSale(){
        Sales maior = SalesDAO.getSales().get(0);
        for (Sales sales : SalesDAO.getSales()) {
            System.out.println("Id.: "+sales.id()+" Total of Sale.: "+sales.getTotalOfSale());
            if(sales.getTotalOfSale().compareTo(maior.getTotalOfSale()) > 0){
                maior = sales;
            }
        }
        return maior;
    }
    
    public static BigDecimal amountOfSales() {
    	BigDecimal amountOfSales = new BigDecimal(0);
    	for (Sales sales : SalesDAO.getSales()) {
    		amountOfSales = amountOfSales.add(sales.getTotalOfSale());
		}
    	return amountOfSales;
    }
    
}
