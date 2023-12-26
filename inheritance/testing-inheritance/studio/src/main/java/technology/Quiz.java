package technology;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() {
        questions= new ArrayList<Question>();
    }

    public void addQuestion (Question question){
        questions.add(question);
    }

    public void runQuiz(){
        for(Question question:questions){
            System.out.println(question.getQuestionText());
            question.printOptions();
            question.userAnswer();

        }

    }
    public int gradeQuiz()
    {
        int grade=0;
        for(Question question:questions){
            grade +=question.getScore();
        }
        return grade;
    }}
