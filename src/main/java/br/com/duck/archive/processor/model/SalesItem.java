package br.com.duck.archive.processor.model;

import java.math.BigDecimal;

public class SalesItem {

	private Long id;
	private Integer numberOfItems;
	private BigDecimal price;

	public SalesItem() {
		super();
	}

	public SalesItem(Long id, Integer numberOfItems, BigDecimal price) {
		super();
		this.id = id;
		this.numberOfItems = numberOfItems;
		this.price = price;
	}

	public Long id() {
		return id;
	}

	public SalesItem id(Long id) {
		this.id = id;
		return this;
	}

	public Integer numberOfItems() {
		return numberOfItems;
	}

	public SalesItem numberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
		return this;
	}

	public BigDecimal price() {
		return price;
	}

	public SalesItem price(BigDecimal price) {
		this.price = price;
		return this;
	}

	public BigDecimal totalOfItems() {
		return price.multiply(new BigDecimal(numberOfItems));
	}

	@Override
	public String toString() {
		return "SalesItem [id=" + id + ", numberOfItems=" + numberOfItems
				+ ", price=" + price + ", totalOfItems=" + totalOfItems() + "]";
	}
	
	
}
