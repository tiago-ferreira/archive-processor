package br.com.duck.archive.processor.converters;

import java.math.BigDecimal;
import java.util.StringTokenizer;

import br.com.duck.archive.processor.model.Salesman;

public class SalesmanConverter implements LineConverter<Salesman>{

    private Salesman salesman = new Salesman();
    
    @Override
    public Salesman converter(String line) {
        StringTokenizer st = new StringTokenizer(line, "ç");
        while (st.hasMoreElements()) {
            String document = st.nextElement().toString();
            String name = st.nextElement().toString();
            BigDecimal salary = new BigDecimal(st.nextElement().toString());
            salesman = new Salesman(document, name, salary);
        }
        return salesman;
    }

}
