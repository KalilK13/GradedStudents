import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getExamScores() {
        StringBuilder scoresString = new StringBuilder();
        int examNumber = 1;
        for(Double score : examScores){
            scoresString.append("Exam " + examNumber + " -> " + score + "\n");
            examNumber += 1;
        }
        System.out.println(scoresString);
    }
    public void addExamScore(double examScore){
        examScores.add(examScore);
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }
    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }
    public double getAverageExamScore(){
        double avg = 0;
        for(Double examScore: examScores){
            avg += examScore;
        }
        return avg/examScores.size();
    }
    public String toString(){
        int examNumber = 1;
        String exams = "";

        for(Double score : examScores){
            exams += String.format("\tExam %d %s %.0f\n",examNumber,"->",score);
        }

//        return this.firstName;
        return String.format("Student Name: %s %s\n" +
                "%c Average Score: %.0f\n" +
                "%c Exam Scores: \n" +
                "%s", firstName, lastName,'>',getAverageExamScore(),'>',exams);
    }
}