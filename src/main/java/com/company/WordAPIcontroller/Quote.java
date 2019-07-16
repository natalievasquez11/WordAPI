package com.company.WordAPIcontroller;

import javax.validation.constraints.NotEmpty;

public class Quote {
    @NotEmpty
    private String author;
    @NotEmpty
    private String quote;

    public Quote() {}

    public Quote(String author, String quote) {
        this.author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
