package br.com.duck.archive.processor.business;

import br.com.duck.archive.processor.dao.SalesDAO;
import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.Salesman;

public class SalesBusiness {

	public Salesman worseSalesmanEver() {
		Salesman toReturn = null;
		
		return toReturn;
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
}
