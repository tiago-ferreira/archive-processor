package br.com.duck.archive.processor.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import br.com.duck.archive.processor.model.Sales;

public class SalesDAO {

	private  List<Sales> sales = new CopyOnWriteArrayList<>();
	
	public void add(Sales sale) {
		sales.add(sale);
	}
	
	public List<Sales> getSales() {
		return sales;
	}
}
