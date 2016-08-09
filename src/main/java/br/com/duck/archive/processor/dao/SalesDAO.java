package br.com.duck.archive.processor.dao;

import java.util.LinkedList;
import java.util.List;

import br.com.duck.archive.processor.model.Sales;

public abstract class SalesDAO {

	private static List<Sales> sales = new LinkedList<>();
	
	public static void add(Sales sale) {
		sales.add(sale);
	}
	
	public static List<Sales> getSales() {
		return sales;
	}
}
