package org.example;


import org.example.questions.QuestionService;

public class Main {
    public static void main(String[] args) {

        QuestionService service = new QuestionService();
        service.displayQuestions();

}
}