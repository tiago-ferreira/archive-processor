package br.com.duck.archive.processor.util;

public class ConverterSelector {

	 public void selectConverter(String string) {
	        int type = Integer.parseInt(string.substring(0, 3));
	        if (type == 001) {
	            String line = string.substring(4, string.length());

	        } else if (type == 002) {
	            String line = string.substring(4, string.length());

	        } else if (type == 003) {
	            String line = string.substring(4, string.length());

	        } else {
	            System.err.println("Type of data not suported :-<");
	        }
	    }
}
