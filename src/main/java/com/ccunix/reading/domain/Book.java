package com.ccunix.reading.domain;

import lombok.Data;

@Data
public class Book {
    private Long id;

    private String bookId;

    private String bookName;

    private String typeId;

    private String authorId;

    private String bookImg;

    private String bookDesc;
}
