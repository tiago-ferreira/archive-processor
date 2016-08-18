package br.com.duck.archive.processor.converters;

import java.util.StringTokenizer;

import br.com.duck.archive.processor.model.Customer;

public class CustomerConverter implements LineConverter<Customer>{
    
    private Customer customer = new Customer();

    @Override
    public Customer converter(String line) {
        StringTokenizer st = new StringTokenizer(line, "ç");
        while (st.hasMoreElements()) {
            String cnpj = st.nextElement().toString();
            String name = st.nextElement().toString();
            String businessArea = st.nextElement().toString();
            customer = new Customer(cnpj, name, businessArea);
        }
        return customer;
    }

    
}
