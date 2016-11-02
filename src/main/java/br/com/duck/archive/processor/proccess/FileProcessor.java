package br.com.duck.archive.processor.proccess;

import java.io.IOException;
import java.util.stream.Stream;

import br.com.duck.archive.processor.business.SalesBusiness;
import br.com.duck.archive.processor.model.Sales;
import br.com.duck.archive.processor.util.ConverterSelector;
import br.com.duck.archive.processor.util.FileReader;

public class FileProcessor {
	
	FileReader fileReader = new FileReader();
	ConverterSelector converter = new ConverterSelector();
	
	public void startProcess() {
		try {
			Stream<String> contentsOfFile = fileReader.readFile("bagacera.dat", true);
			contentsOfFile.forEach( a -> converter.selectConverter(a));
			Sales mostExpensiveSale = SalesBusiness.getMostExpensiveSale();
			System.out.println(mostExpensiveSale);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
