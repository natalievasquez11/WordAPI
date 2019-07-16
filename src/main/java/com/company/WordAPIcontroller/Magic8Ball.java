package com.company.WordAPIcontroller;

import javax.validation.constraints.NotEmpty;

public class Magic8Ball {
    @NotEmpty
    private String question;
    @NotEmpty
    private String answer;

    public Magic8Ball() {}

    public Magic8Ball(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
