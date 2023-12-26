package technology;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckBoxQuestion extends Question{
    private ArrayList<String> answerOptions;
    private String userAnswers;
    private String correctAnswers;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(String userAnswers) {
        this.userAnswers = userAnswers;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
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
        if(correctAnswers.equals(userAnswers)){
            setScore(getScore()+marks);
        }
    }

}
