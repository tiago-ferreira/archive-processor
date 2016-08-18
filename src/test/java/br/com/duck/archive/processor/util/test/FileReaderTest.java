package br.com.duck.archive.processor.util.test;

import java.io.IOException;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import br.com.duck.archive.processor.util.FileReader;

public class FileReaderTest {

	FileReader fileReader = new FileReader();
	
	
	@Test
	public void testReadFile() throws IOException {
		Stream<String> lines = fileReader.readFile("bagacera.dat", true);
		Assert.assertNotNull(lines);
		Assert.assertTrue(lines.count() > 0);
	}
	
	@Test(expected=IOException.class)
	public void testReadFileThatNotExist() throws IOException{
		fileReader.readFile("tijolo.dat", false);
	}
	
	@Test
	public void testIsReadable() {
		Assert.assertTrue(fileReader.isReadable("/home"));
	}
	
	@Test
	public void testIsNotReadable() {
		Assert.assertFalse(fileReader.isReadable("/etc/cavera"));
	}
}
