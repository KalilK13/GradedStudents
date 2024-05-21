import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();
        ArrayList<Double> examScores3 = new ArrayList<>();
        ArrayList<Double> examScores4 = new ArrayList<>();
        ArrayList<Double> examScores5 = new ArrayList<>();
        ArrayList<Double> examScores6 = new ArrayList<>();
        ArrayList<Double> examScores7 = new ArrayList<>();
        ArrayList<Double> examScores8 = new ArrayList<>();
        ArrayList<Double> examScores9 = new ArrayList<>();
        ArrayList<Double> examScores10 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(97d);
        examScores2.add(81d);
        examScores2.add(88d);

        examScores3.add(100d);
        examScores3.add(76d);
        examScores3.add(70d);

        examScores4.add(0d);
        examScores4.add(59d);
        examScores4.add(70d);

        examScores5.add(90d);
        examScores5.add(80d);
        examScores5.add(70d);

        examScores6.add(80d);
        examScores6.add(80d);
        examScores6.add(80d);

        examScores7.add(65d);
        examScores7.add(80d);
        examScores7.add(72d);

        examScores8.add(0d);
        examScores8.add(0d);
        examScores8.add(0d);

        examScores9.add(70d);
        examScores9.add(98d);
        examScores9.add(90d);

        examScores10.add(68d);
        examScores10.add(70d);
        examScores10.add(77d);


        Student student1 = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);
        Student student3 = new Student("Dan", "Nelson", examScores3);
        Student student4 = new Student("Ashley", "Finn", examScores4);
        Student student5 = new Student("Simon", "Wilson", examScores5);
        Student student6 = new Student("Benard", "Jackson", examScores6);
        Student student7 = new Student("Mitchel", "Dawn", examScores7);
        Student student8 = new Student("Max", "Sax", examScores8);
        Student student9 = new Student("Shaun", "Lendell", examScores9);
        Student student10 = new Student("Frida", "Vasquez", examScores10);

        Student[] classArray = {null,student1,student2,student3,student4,student5,student6,student7,student8,student9,student10,null};

//        Classroom classroom = new Classroom();
        Classroom classroom = new Classroom(classArray);

//        classroom.addStudent(student1);
//        classroom.addStudent(student2);
//        classroom.addStudent(student3);

//        classroom.removeStudent("Kalil", "Kennedy");

        System.out.println(classroom.getAverageExamScore());
        System.out.println(Arrays.toString(classroom.getStudents()));
//        classroom.getStudentsByScores();
//        System.out.println(Arrays.toString(classroom.getStudents()));
//        System.out.println(classroom.getGradeBook());
//        System.out.println(student1.getAverageExamScore());
//        System.out.println(student2.getAverageExamScore());




    }
}
