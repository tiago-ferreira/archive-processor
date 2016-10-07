package br.com.duck.archive.processor.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import br.com.duck.archive.processor.model.Salesman;

public class SalesmanDAO {

	private static List<Salesman> salesmans = new CopyOnWriteArrayList<>();

	public static void add(Salesman salesman) {
		salesmans.add(salesman);
	}

	public static List<Salesman> getSalesmans() {
		return salesmans;
	}
}
