package br.com.duck.archive.processor.converters;

import java.util.List;
import java.util.StringTokenizer;

import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.model.SalesItem;
import br.com.duck.archive.processor.model.Salesman;

public class SalesConverter implements LineConverter<Sales>{

	    private Sales sales = new Sales();
	    private SalesItemConverter salesItemConverter = new SalesItemConverter();

	    public Sales converter(String value) {
	        StringTokenizer st = new StringTokenizer(value, "ç");
	        while (st.hasMoreElements()) {
	            Long id = Long.parseLong(st.nextElement().toString());
	            List<SalesItem> items = salesItemConverter.convertStringInSalesItems(st.nextElement().toString());
	            String salesmanName = st.nextElement().toString();
	            sales = new Sales(id, items, new Salesman(salesmanName));
	        }
	        return sales;
	    }

}
