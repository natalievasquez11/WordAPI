package com.company.WordAPIcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;



// Quotes must be served up at random.
// Words and definitions must be served up at random.
// Your service must contain at least 6 different magic 8-ball responses.
// 8-ball answers must be served up at random.

@RestController
public class WordController {

    public WordController() {
        List<Quote> quotes = new ArrayList<>();
        List<Word> words = new ArrayList<>();

        //add quotes
        quotes.add(new Quote("Pooh Bear", "People say nothing is impossible, but I do nothing every day."));
        quotes.add(new Quote("Pooh Bear", "I think we dream so we don’t have to be apart for so long. If we’re in each other’s dreams, we can be together all the time."));
        quotes.add(new Quote("Andy Rooney", "The average dog is a nicer person than the average person."));
        quotes.add(new Quote("Alexander Woollcott", "All the things I really like to do are either immoral, illegal or fattening."));
        quotes.add(new Quote("Arthur C. Clarke", "I don’t believe in astrology; I’m a Sagittarius and we’re skeptical."));
        quotes.add(new Quote("Bryan White", "We never really grow up, we only learn how to act in public."));
        quotes.add(new Quote("Doug Larson", "To err is human; to admit it, superhuman."));
        quotes.add(new Quote("Douglas Adams", "I refuse to answer that question on the grounds that I don’t know the answer."));
        quotes.add(new Quote("Elbert Hubbard", "Do not take life too seriously. You will never get out of it alive."));
        quotes.add(new Quote("George Burns", "Happiness is having a large, loving, caring, close-knit family in another city."));

        //add words
        words.add(new Word("Cupboard","A closet with shelves for dishes, cups, etc."));
        words.add(new Word("Utopia", "An ideal place or state."));
        words.add(new Word("Inglenook", "A cozy nook by the hearth."));
        words.add(new Word("Ratatouille", "A spicy French stew."));
        words.add(new Word("Serendipity", "Finding something nice while looking for something else."));
        words.add(new Word("Comely", "Attractive"));
        words.add(new Word("Efflorescence", "Flowering, blooming."));
        words.add(new Word("Imbue", "To infuse, instill."));
        words.add(new Word("Petrichor", "The smell of earth after rain."));
        words.add(new Word("Sumptuous", "Lush, luxurious."));
    }


    // URI: /quote, Method: GET, Request Body: None, Response Body: Quote,
// Quote Object:
// Author, Quote

//    @RequestMapping(value="/quote", method= RequestMethod.GET)
//    public void getQuote() {
//
//    }
//
// URI: /word, Method: GET, Request Body: None, Response Body: Definition
//Definition Object: Word, Definition

// URI: /magic, Method: POST, Request Body: Question, Response Body: Answer
// Answer Object: Question, Answer




}
