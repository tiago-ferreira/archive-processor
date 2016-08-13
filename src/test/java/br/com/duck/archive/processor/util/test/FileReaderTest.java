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
		Stream<String> lines = fileReader.readFile("/home/tiago/bagacera.dat");
		Assert.assertNotNull(lines);
		Assert.assertTrue(lines.count() > 0);
	}
	
	@Test(expected=IOException.class)
	public void testReadFileThatNotExist() throws IOException{
		fileReader.readFile("/home/tiago/tijolo.dat");
	}
	
	@Test
	public void testIsReadable() {
		Assert.assertTrue(fileReader.isReadable("/home/tiago/bagacera.dat"));
	}
	
	@Test
	public void testIsNotReadable() {
		Assert.assertTrue(fileReader.isReadable("/etc"));
	}
}
