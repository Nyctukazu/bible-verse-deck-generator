package com.copgogroup.service;

import org.springframework.stereotype.Service;

import com.copgogroup.repository.VerseRepository;
import com.copgogroup.service.interfaces.VerseServiceImpl;
import com.copgogroup.model.entity.VerseModel;
import com.copgogroup.model.enums.Book;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VerseService implements VerseServiceImpl {
    private final VerseRepository verseRepo;

    @Override
    public String getVerseText(Book book, int chapter, int startVerse, int endVerse) {
        List<VerseModel> verses = verseRepo
                .findByBookAndChapterAndVerseNumberBetweenOrderByVerseNumberAsc(null, null, null, null);

        return verses.stream()
                .map(VerseModel::getText)
                .collect(Collectors.joining(" "));

    }
}
