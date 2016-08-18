package br.com.duck.archive.processor.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

	public Stream<String> readFile(String path, boolean isClasspath) throws IOException{
	    if(isClasspath) {
	        try {
                return Files.lines(
                        Paths.get(getClass().getClassLoader()
                            .getResource(path)
                            .toURI())
                        );
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
	    }
		return Files.lines(Paths.get(path));
	}
	
	public Boolean isReadable(String path) {
		return Files.isReadable(Paths.get(path));
	}
	
}
