package technology;

public class QuizRunner {

    public static void main(String[] args){
        Quiz quiz = new Quiz();
        MultipleChoice q1 =new MultipleChoice();
        quiz.addQuestion(q1);
        BooleanQuestion q2 =new BooleanQuestion();
        quiz.addQuestion(q2);
        CheckBoxQuestion q3 =new CheckBoxQuestion();
        quiz.addQuestion(q3);
        quiz.runQuiz();
        System.out.println("score :"+quiz.gradeQuiz());
    }
}
