package br.com.duck.archive.processor.converters;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import br.com.duck.archive.processor.model.SalesItem;

public class SalesItemConverter implements LineConverter<SalesItem> {

	private SalesItem SalesItem = new SalesItem();
	private List<SalesItem> SalesItems = new ArrayList<>();

	public List<SalesItem> convertStringInSalesItems(String value) {
		String valueFormatted = value.replace("[", "").replace("]", "");
		StringTokenizer st = new StringTokenizer(valueFormatted, ",");
		while (st.hasMoreElements()) {
			SalesItem it = new SalesItem();
			it = convertStringInSalesItem(st.nextElement().toString());
			SalesItems.add(it);
		}
		return SalesItems;
	}

	public SalesItem convertStringInSalesItem(String value) {

		StringTokenizer st = new StringTokenizer(value, "-");
		while (st.hasMoreElements()) {
			Long id = Long.parseLong(st.nextElement().toString());
			Integer numbersOfSalesItem = Integer.parseInt(st.nextElement()
					.toString());
			BigDecimal price = new BigDecimal(st.nextElement().toString());
			SalesItem = new SalesItem(id, numbersOfSalesItem, price);
		}
		return SalesItem;
	}

	@Override
	public br.com.duck.archive.processor.model.SalesItem converter(String line) {
		return convertStringInSalesItem(line);
	}
}
