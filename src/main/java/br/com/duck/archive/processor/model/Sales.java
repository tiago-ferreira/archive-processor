package br.com.duck.archive.processor.model;

import br.com.duck.archive.processor.types.LayoutType;

public class Sales {

	private LayoutType layout;
	private Long Id;
	private SalesItem salesItem;
	private Salesman salesman;

	public LayoutType layout() {
		return layout;
	}

	public Sales layout(LayoutType layout) {
		this.layout = layout;
		return this;
	}

	public Long id() {
		return Id;
	}

	public Sales id(Long id) {
		Id = id;
		return this;
	}

	public SalesItem salesItem() {
		return salesItem;
	}

	public Sales salesItem(SalesItem salesItem) {
		this.salesItem = salesItem;
		return this;
	}

	public Salesman salesman() {
		return salesman;
	}

	public Sales salesman(Salesman salesman) {
		this.salesman = salesman;
		return this;
	}

}
