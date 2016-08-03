package br.com.duck.archive.processor.model;

import br.com.duck.archive.processor.types.LayoutType;

public class Customer {

	private LayoutType layout;
	private String document;
	private String name;
	private String businessArea;

	public LayoutType layout() {
		return layout;
	}

	public Customer layout(LayoutType layout) {
		this.layout = layout;
		return this;
	}

	public String document() {
		return document;
	}

	public Customer document(String document) {
		this.document = document;
		return this;
	}

	public String name() {
		return name;
	}

	public Customer name(String name) {
		this.name = name;
		return this;
	}

	public String businessArea() {
		return businessArea;
	}

	public Customer businessArea(String businessArea) {
		this.businessArea = businessArea;
		return this;
	}

}
