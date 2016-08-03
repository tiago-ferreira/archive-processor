package br.com.duck.archive.processor.model;

import br.com.duck.archive.processor.types.LayoutType;

public class Sales {

	private LayoutType layout;
	private Long Id;
	private SalesItem salesItem;
	private Salesman salesman;

	public LayoutType getLayout() {
		return layout;
	}

	public void setLayout(LayoutType layout) {
		this.layout = layout;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public SalesItem getSalesItem() {
		return salesItem;
	}

	public void setSalesItem(SalesItem salesItem) {
		this.salesItem = salesItem;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

}
