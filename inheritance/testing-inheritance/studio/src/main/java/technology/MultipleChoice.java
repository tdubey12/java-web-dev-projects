package technology;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{
    private ArrayList<String> answerOptions;
    private int userInput;
    private int correctAnswer;

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void printOptions() {
        int counter = 1;
        for(String option:answerOptions){
            System.out.println(counter+" "+option);
            ++counter;
        }


    }

    @Override
    public void userAnswer() {
        System.out.println("enter correct options number e.g. 1,2");

        Scanner input =new Scanner(System.in);
        userInput=input.nextInt();
        if(correctAnswer==userInput){
            setScore(getScore()+1);
        }
    }
}
