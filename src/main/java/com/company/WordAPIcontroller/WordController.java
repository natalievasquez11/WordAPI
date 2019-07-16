package com.company.WordAPIcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


@RestController
public class WordController {
    Random rand = new Random();
    private List<Quote> quotes = new ArrayList<>();
    private List<Word> words = new ArrayList<>();
    private List<Magic8Ball> magic8Balls = new ArrayList<>();


    public WordController() {
        //add quotes
        this.quotes.add(new Quote("Pooh Bear", "People say nothing is impossible, but I do nothing every day."));
        this.quotes.add(new Quote("Pooh Bear", "I think we dream so we don’t have to be apart for so long. If we’re in each other’s dreams, we can be together all the time."));
        this.quotes.add(new Quote("Andy Rooney", "The average dog is a nicer person than the average person."));
        this.quotes.add(new Quote("Alexander Woollcott", "All the things I really like to do are either immoral, illegal or fattening."));
        this.quotes.add(new Quote("Arthur C. Clarke", "I don’t believe in astrology; I’m a Sagittarius and we’re skeptical."));
        this.quotes.add(new Quote("Bryan White", "We never really grow up, we only learn how to act in public."));
        this.quotes.add(new Quote("Doug Larson", "To err is human; to admit it, superhuman."));
        this.quotes.add(new Quote("Douglas Adams", "I refuse to answer that question on the grounds that I don’t know the answer."));
        this.quotes.add(new Quote("Elbert Hubbard", "Do not take life too seriously. You will never get out of it alive."));
        this.quotes.add(new Quote("George Burns", "Happiness is having a large, loving, caring, close-knit family in another city."));

        //add words
        this.words.add(new Word("Cupboard","A closet with shelves for dishes, cups, etc."));
        this.words.add(new Word("Utopia", "An ideal place or state."));
        this.words.add(new Word("Inglenook", "A cozy nook by the hearth."));
        this.words.add(new Word("Ratatouille", "A spicy French stew."));
        this.words.add(new Word("Serendipity", "Finding something nice while looking for something else."));
        this.words.add(new Word("Comely", "Attractive"));
        this.words.add(new Word("Efflorescence", "Flowering, blooming."));
        this.words.add(new Word("Imbue", "To infuse, instill."));
        this.words.add(new Word("Petrichor", "The smell of earth after rain."));
        this.words.add(new Word("Sumptuous", "Lush, luxurious."));

        //add 8ball answers
        this.magic8Balls.add(new Magic8Ball(null, "As I see it, yes."));
        this.magic8Balls.add(new Magic8Ball(null, "Reply hazy, try again."));
        this.magic8Balls.add(new Magic8Ball(null, "Don't count on it."));
        this.magic8Balls.add(new Magic8Ball(null, "Outlook good."));
        this.magic8Balls.add(new Magic8Ball(null, "Better not tell you now."));
        this.magic8Balls.add(new Magic8Ball(null, "Very doubtful."));
        this.magic8Balls.add(new Magic8Ball(null, "You may rely on it."));
        this.magic8Balls.add(new Magic8Ball(null, "Signs point to yes."));
        this.magic8Balls.add(new Magic8Ball(null, "Cannot predict now."));
        this.magic8Balls.add(new Magic8Ball(null, "My sources say no."));

    }


    // URI: /quote, Method: GET, Request Body: None, Response Body: Quote,
// Quote Object:
// Author, Quote

    @RequestMapping(value="/quote", method= RequestMethod.GET)
    public Quote getQuote() {
        Quote randomQuote = this.quotes.get(rand.nextInt(this.quotes.size()));
        return randomQuote;
    }
//
// URI: /word, Method: GET, Request Body: None, Response Body: Definition
//Definition Object: Word, Definition

    @RequestMapping(value="/word", method=RequestMethod.GET)
    public Word getWord() {
        Word randomWord = this.words.get(rand.nextInt(this.words.size()));
        return randomWord;
    }

// URI: /magic, Method: POST, Request Body: Question, Response Body: Answer
// Answer Object: Question, Answer
    // Your service must contain at least 6 different magic 8-ball responses.
// 8-ball answers must be served up at random.
    @RequestMapping(value="/magic/", method=RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    public String addQuestion(@RequestBody Magic8Ball magic8Ball) {
        Magic8Ball random8ball = this.magic8Balls.get(rand.nextInt(this.magic8Balls.size()));
        return random8ball.getAnswer();
    }
}
