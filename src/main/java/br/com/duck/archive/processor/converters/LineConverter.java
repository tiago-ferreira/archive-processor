package br.com.duck.archive.processor.converters;

public interface LineConverter<T> {

    T converter(String line);
    
}
