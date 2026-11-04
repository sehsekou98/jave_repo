package org.example.questions;

public class QuestionService {
    Question[] questions = new Question[5];


    public QuestionService() {
        questions[0] = new Question(
                1, "Which of the following core Object-Oriented Programming principles best describes the mechanism of hiding internal data and restricting direct access to an object's state?",
                "Polymorphism",
                "Inheritance",
                "Encapsulation",
                "Abstraction",
                "Encapsulation");

        questions[1] = new Question(
                2, "In Java, which memory area is primarily responsible for storing object instances and arrays created dynamically at runtime via the new keyword?",
                "The Stack",
                "The Heap",
                "Method Area",
                "Pc Register",
                "The Heap");

        questions[2] = new Question(
                3, "Which of the following statements regarding Java exception handling is true?",
                "Checked exceptions must be caught or declared in a method signature using the throws keyword.",
                "RuntimeException and its subclasses are considered checked exceptions by the compiler.",
                "The finally block will execute even if the try block calls System.exit(0).",
                "You cannot have a try block without a catch block under any circumstance.",
                "Checked exceptions must be caught or declared in a method signature using the throws keyword.");

        questions[3] = new Question(
                4, "Which Java Collection interface guarantees that all elements are unique (no duplicate values) and uses the equals() and hashCode() contracts to enforce this uniqueness?",
                "List",
                "Queue",
                "Map",
                "Set",
                "Set");

        questions[4] = new Question(
                5, "Which of the following is not a standard way to create or initialize a new thread of execution in Java?",
                "Implementing the Runnable interface and passing it to a Thread object",
                "Extending the Thread class and overriding its run() method.",
                "Implementing the Serializable interface and invoking its startThread() method.",
                "Implementing the Serializable interface and invoking its startThread() method.",
                "Implementing the Serializable interface and invoking its startThread() method.");
    }

    public void displayQuestions()
    {
         for (Question q : questions);
}
}

