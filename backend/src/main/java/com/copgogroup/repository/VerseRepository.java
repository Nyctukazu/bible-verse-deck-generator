package com.copgogroup.repository;

import com.copgogroup.model.entity.VerseModel;
import com.copgogroup.model.enums.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface VerseRepository extends JpaRepository<VerseModel, Long> {
    Optional<VerseModel> findByBookAndChapterAndVerseNumber(Book book, Integer chapter, Integer verseNumber);
    List<VerseModel> findByBookAndChapterAndVerseNumberBetweenOrderByVerseNumberAsc(
            Book book, Integer chapter, Integer startVerse, Integer endVerse);
    long count();
    
}
