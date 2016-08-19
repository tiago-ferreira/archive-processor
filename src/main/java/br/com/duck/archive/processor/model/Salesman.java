package br.com.duck.archive.processor.model;

import java.math.BigDecimal;

import br.com.duck.archive.processor.types.LayoutType;

public class Salesman {

    private LayoutType layout;
    private String document;
    private String name;
    private BigDecimal salary;

    public Salesman() {
        super();
    }

    public Salesman(LayoutType layout, String document, String name, BigDecimal salary) {
        super();
        this.layout = layout;
        this.document = document;
        this.name = name;
        this.salary = salary;
    }

    public Salesman(String document, String name,
	            BigDecimal salary) {
	        super();
	        this.document = document;
	        this.name = name;
	        this.salary = salary;
    }
    
    public LayoutType layout() {
        return layout;
    }

    public Salesman layout(LayoutType layout) {
        this.layout = layout;
        return this;
    }

    public String document() {
        return document;
    }

    public Salesman document(String document) {
        this.document = document;
        return this;
    }

    public String name() {
        return name;
    }

    public Salesman name(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal salary() {
        return salary;
    }

    public Salesman salary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }

}
