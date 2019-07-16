package com.company.WordAPIcontroller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

// URI: /quote, Method: GET, Request Body: None, Response Body: Quote,
// Quote Object:
// Author, Quote
//
// URI: /word, Method: GET, Request Body: None, Response Body: Definition
//Definition Object: Word, Definition

// URI: /magic, Method: POST, Request Body: Question, Response Body: Answer
// Answer Object: Question, Answer

// Your service must contain at least 10 quotes. Quotes must be served up at random.
// Your service must contain at least 10 words and their corresponding definitions.
// Words and definitions must be served up at random.
// Your service must contain at least 6 different magic 8-ball responses.
// 8-ball answers must be served up at random.

@RestController
public class WordController {
    List<Quote> quotes = new ArrayList<>();
    List<Word> words = new ArrayList<>();

}
