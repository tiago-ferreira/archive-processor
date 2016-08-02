package br.com.duck.archive.processor.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

	public Stream<String> readFile(String path) throws IOException{
		return Files.lines(Paths.get(path));
	}
	
	
}
