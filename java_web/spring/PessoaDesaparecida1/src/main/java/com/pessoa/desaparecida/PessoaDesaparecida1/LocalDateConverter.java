package com.pessoa.desaparecida.PessoaDesaparecida1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ComponentScan
public class LocalDateConverter implements Converter<String, LocalDate> {
    private static final String DATE_FORMAT = "dd-MM-yyyy";

    @Override
    public LocalDate convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
            return LocalDate.parse(source, formatter);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date format. Please use dd-MM-yyyy.");
        }
    }
}
