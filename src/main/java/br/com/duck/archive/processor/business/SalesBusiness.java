package br.com.duck.archive.processor.business;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import br.com.duck.archive.processor.dao.SalesDAO;
import br.com.duck.archive.processor.dao.SalesmanDAO;
import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.Salesman;

public class SalesBusiness {

	public static Salesman worseSalesmanEver() {
        Salesman worseSalesman = null;
        Map<Salesman,BigDecimal> salesmanSales = new HashMap<>();
        
        for (Salesman salesman : SalesmanDAO.getSalesmans()) {
        	BigDecimal totalSalesBySalesman = new BigDecimal(0);			
        	for(Sales sales : SalesDAO.getSales()) {
        		if(sales.salesman().name().equals(salesman.name())) {
        			totalSalesBySalesman = totalSalesBySalesman.add(sales.getTotalOfSale());
        		}
        	}
        	salesmanSales.put(salesman, totalSalesBySalesman);
		}
        worseSalesman = getWorseSalesmanEver(salesmanSales);
        return worseSalesman;
	}
	
	
    private static Salesman getWorseSalesmanEver(Map<Salesman, BigDecimal> salesmanSales) {
    	BigDecimal keyToReturn =  salesmanSales.entrySet().iterator().next().getValue();
    	Salesman toReturn = salesmanSales.entrySet().iterator().next().getKey();
    	for (Entry<Salesman, BigDecimal> sa : salesmanSales.entrySet()) {
			if(keyToReturn.compareTo(sa.getValue()) > 0) {
				toReturn = sa.getKey();
			}
		}
		return toReturn;
	}


	public static Sales getMostExpensiveSale(){
        Sales maior = SalesDAO.getSales().get(0);
        for (Sales sales : SalesDAO.getSales()) {
            if(sales.getTotalOfSale().compareTo(maior.getTotalOfSale()) > 0){
                maior = sales;
            }
        }
        return maior;
    }
    
    public static BigDecimal amountOfSales() {
    	BigDecimal amountOfSales = new BigDecimal(0);
    	for (Sales sales : SalesDAO.getSales()) {
    		System.out.println("Salesman: "+sales.salesman().name()+", total= "+sales.getTotalOfSale());
    		amountOfSales = amountOfSales.add(sales.getTotalOfSale());
		}
    	return amountOfSales;
    }
    
}
