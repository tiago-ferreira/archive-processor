package br.com.duck.archive.processor.types;

public enum LayoutType {
	CUSTOMER(002), SALES(003), SALESMAN(001);
	
	private int code;
	
	private LayoutType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	
}	