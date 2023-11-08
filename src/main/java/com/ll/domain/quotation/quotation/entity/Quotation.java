package com.ll.domain.quotation.quotation.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Quotation {
    private long id;
    private String content;
    private String author;

    public Quotation(long id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}
