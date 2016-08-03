package br.com.duck.archive.processor.model;

import java.math.BigDecimal;

import br.com.duck.archive.processor.types.LayoutType;

public class Salesman {

	private LayoutType layout;
	private String document;
	private String name;
	private BigDecimal salary;

	public LayoutType getLayout() {
		return layout;
	}

	public void setLayout(LayoutType layout) {
		this.layout = layout;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
