package br.com.duck.archive.processor.model;

import br.com.duck.archive.processor.types.LayoutType;

public class Customer {

	private LayoutType layout;
	private String document;
	private String name;
	private String businessArea;

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

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

}
