package technology;

public abstract class Question {
   private String questionText;
   private int score;

    public Question() {
    }

    public Question(String questionText, int score) {
        this.questionText = questionText;
        this.score = score;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public abstract void printOptions();

    public abstract void userAnswer();

}

