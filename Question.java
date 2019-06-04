package com.example.quiz;

import java.io.OptionalDataException;


    public class Question { public String questions[] = {
        "Which is a Programming Language?",
        "How many States are there in India?",
        "Where is Manav Rachna Located?"
};

    public String choices[][] = {
            {"Hindi", "French", "English", "PHP"},
            {"42", "16", "29", "10"},
            {"Pune", "Mumbai", "USA", "Faridabad"}
    };

    public String correctAnswer[] = {
            "PHP",
            "29",
            "Faridabad"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}



