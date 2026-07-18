package com.copgogroup.dto.Requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record VerseRequest(
    @NotBlank(message = "Book name is required")
    String book,

    @Min(value = 1, message = "Chapter must be 1 or greater")
    int chapter,

    @Min(value = 1, message = "Start verse must be 1 or greater")
    int startVerse,

    Integer endVerse
) {}
