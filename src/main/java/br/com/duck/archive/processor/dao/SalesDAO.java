package br.com.duck.archive.processor.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import br.com.duck.archive.processor.model.Sales;

public class SalesDAO {

	private static List<Sales> sales = new CopyOnWriteArrayList<>();
	
	public static void add(Sales sale) {
		sales.add(sale);
	}
	
	public static List<Sales> getSales() {
		return sales;
	}
}
