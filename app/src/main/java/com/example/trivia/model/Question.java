package com.example.trivia.model;

public class Question {
    private String answer;
    private boolean isAnswerTrue;

    public Question(String s) {}

    public Question(String answer, boolean isAnswerTrue) {
        this.answer = answer;
        this.isAnswerTrue = isAnswerTrue;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isAnswerTrue() {
        return isAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        isAnswerTrue = answerTrue;
    }

    @Override
    public String toString() {
        return "Question{" +
                "answer='" + answer + '\'' +
                ", isAnswerTrue=" + isAnswerTrue +
                '}';
    }
}
