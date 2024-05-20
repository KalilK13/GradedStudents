import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private Student[] students;

    public Classroom(){
        this.students = new Student[30];
    }
    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students){
//        this.students = students;
        Student currentStudent;
        boolean continueloop = true;
        while(continueloop) {
            for (int i = 0; i < students.length; i++) {
//                if(students[i] != null){
//                    break;
//                }
                if (i != students.length - 1 && students[i + 1] != null) {
                    currentStudent = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = currentStudent;
                }
            }
            int count = 0;
            for (int y = count + 1; y <= students.length - 1; y++) {
                if (students[count] == null && students[y] != null) {
                    break;
                }
                if(y == students.length-1){
                    this.students = students;
                    continueloop = false;
                }
                count++;
            }
        }
    }

    public Student[] getStudents() {
        return students;
    }
    public double getAverageExamScore(){
        double sumOfScores = 0;
        int count = 0;
        for (Student student: students){
            if(student != null) {
                sumOfScores += student.getAverageExamScore();
                count++;
            }
        }
        return sumOfScores/count;
    }
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
    public void removeStudent(String firstName, String lastName){
        String studentName = firstName + lastName;
        Student currentStudent;
        int count = 0;
        for (Student student: students){
            if(studentName.equalsIgnoreCase(student.getFirstName() + student.getLastName())){
                students[count] = null;

                break;
            }
            count++;
        }

        for(int i = 0; i < students.length; i++){
            if(students[i] == null && i != students.length - 1 && students[i+1] != null){
                currentStudent = students[i];
                students[i] = students[i+1];
                students[i+1] = currentStudent;
            }
        }
    }
    public Student[] getStudentsByScores(){
        Student[] students = this.students;
        Student currentStudent;
        if (students.length == 1){
            return students;
        }
        while (true){
            for(int i = 0; i < students.length; i++){
                if(students[i] == null){
                    break;
                }
                if(i != students.length - 1 &&students[i+1] != null && students[i].getAverageExamScore() < students[i+1].getAverageExamScore()){
                    currentStudent = students[i];
                    students[i] = students[i+1];
                    students[i+1] = currentStudent;
                }
            }
            int count = 0;
            for (int y = count+1; y < students.length; y++ ){
                if(students[y] != null && students[count].getAverageExamScore() < students[y].getAverageExamScore()){
                    break;
                }
                if(y == students.length - 1 && students[y] == null || y == students.length - 1 && students[count].getAverageExamScore() > students[y].getAverageExamScore()){
                    return students;
                }
                count++;
            }

//            break;
        }
//        return null;
    }
    public Map<Student, Character> getGradeBook(){
        Student[] studentRankings = getStudentsByScores();
        Map<Student, Character> gradeBook = new HashMap<>();
        double classHighestGrade = studentRankings[0].getAverageExamScore();
        double studentPercentage = 0;
        Character grade;
        for (int i = 0; i < studentRankings.length; i++){
//            studentPercentage = (1 - ((double) (i + 1) / studentRankings.length)) *100;
            if(studentRankings[i] != null) {
                studentPercentage = (studentRankings[i].getAverageExamScore() / classHighestGrade) * 100;
            }
            if(studentRankings[i] == null){
                continue;
            }
            if(studentPercentage >= 90){
                grade = 'A';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 90 && studentPercentage >= 71) {
                grade = 'B';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 71 && studentPercentage >= 50) {
                grade = 'C';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 50 && studentPercentage >= 11) {
                grade = 'D';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 11) {
                grade = 'F';
                gradeBook.put(studentRankings[i], grade);
            }
        }
        return gradeBook;
    }
}
