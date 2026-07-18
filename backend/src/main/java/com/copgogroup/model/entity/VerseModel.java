package com.copgogroup.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(
    name = "verses",
    indexes = {
        @Index(name = "idx_book_chapter_verse", columnList = "book")
    }
)
@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VerseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String book;

    @Column(nullable = false)
    private Integer chapter;

    @Column(name = "verse_number", nullable = false)
    private Integer verseNumber;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;
}
