package br.com.duck.archive.processor.model;

import java.math.BigDecimal;
import java.util.List;

import br.com.duck.archive.processor.types.LayoutType;

public class Sales {

	private LayoutType layout;
	private Long Id;
	private List<SalesItem> salesItem;
	private Salesman salesman;

	public Sales(){
	}
	
	public Sales(Long id, List<SalesItem> salesItem, Salesman salesman) {
		super();
		Id = id;
		this.salesItem = salesItem;
		this.salesman = salesman;
	}
	
	
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

	public List<SalesItem> salesItem() {
		return salesItem;
	}

	public Sales salesItem(List<SalesItem> salesItem) {
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

	public BigDecimal getTotalOfSale() {
		BigDecimal total = new BigDecimal(0);
		for (SalesItem sa : this.salesItem) {
			BigDecimal to = sa.totalOfItems();
			total = total.add(to);
		}
		return total;
	}

	@Override
	public String toString() {
		return "Sales [layout=" + layout + ", Id=" + Id + ", salesItem="
				+ salesItem + ", salesman=" + salesman + ", getTotalOfSale()="
				+ getTotalOfSale() + "]";
	}

	
}
