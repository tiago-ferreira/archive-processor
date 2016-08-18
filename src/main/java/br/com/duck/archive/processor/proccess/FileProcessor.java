package br.com.duck.archive.processor.proccess;

import java.io.IOException;
import java.util.stream.Stream;

import br.com.duck.archive.processor.util.FileReader;

public class FileProcessor {
	
	FileReader fileReader = new FileReader();
	
	public void startProcess() {
		try {
			Stream<String> contentsOfFile = fileReader.readFile("bagacera.dat", true);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
