package com.copgogroup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copgogroup.service.VerseService;
import com.copgogroup.model.enums.Book;

import com.copgogroup.dto.Requests.VerseRequest;
import com.copgogroup.dto.Responses.VerseResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@RestController
@RequestMapping("/api/verses")
@RequiredArgsConstructor
public class VerseController {
    private final VerseService verseService;

    @GetMapping
    public ResponseEntity<VerseResponse> getVerse(@ModelAttribute VerseRequest request) {

        int chap = request.chapter();
        int start = request.startVerse();
        Book resolvedBook = Book.fromAlias(request.book());
        int end = request.endVerse() != null ? request.endVerse() : request.startVerse();

        String text = verseService.getVerseText(
            resolvedBook, 
            chap, 
            start, 
            end
        );

        return ResponseEntity.ok(new VerseResponse(text));
    }
}
