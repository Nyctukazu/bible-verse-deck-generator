package com.copgogroup.service;

import com.copgogroup.model.enums.Book;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Arrays;

@Converter(autoApply = true)
public class BookAttributeConverter implements AttributeConverter<Book, String> {
    @Override
    public String convertToDatabaseColumn(Book book) {
        return book == null ? null : book.getOsisCode();
    }

    @Override
    public Book convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
        
        return Arrays.stream(Book.values())
                .filter(b -> b.getOsisCode().equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown OSIS code: " + code));
    }
}
