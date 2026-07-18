package com.copgogroup.service.interfaces;

import com.copgogroup.model.enums.Book;

public interface VerseServiceImpl {
    String getVerseText(Book book, int chapter, int startVerse, int endVerse);
}
