package technology;

import java.util.Scanner;

public class BooleanQuestion extends Question{
    private boolean correctAnswer;
    private int score;

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public void printOptions(){
        System.out.println("1.True");
        System.out.println("2.False");
    }

    @Override
    public void userAnswer() {
        System.out.println("enter option True/False :");
        Scanner input = new Scanner(System.in);
        boolean userChoice= input.nextBoolean();
        if(userChoice == correctAnswer){
           setScore(getScore()+1);
        }
    }


}
