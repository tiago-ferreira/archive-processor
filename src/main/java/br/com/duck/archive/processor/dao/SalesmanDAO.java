package br.com.duck.archive.processor.dao;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import br.com.duck.archive.processor.model.Salesman;

public class SalesmanDAO {

	private List<Salesman> salesmans = new CopyOnWriteArrayList<>();

	public void add(Salesman salesman) {
		salesmans.add(salesman);
	}

	public List<Salesman> getSalesmans() {
		return salesmans;
	}
}
