import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

//    private Classroom classroom;
    private Student[] students;

//    @BeforeEach void test() {
//        ArrayList<Double> examScores1 = new ArrayList<>();
//        ArrayList<Double> examScores2 = new ArrayList<>();
//        ArrayList<Double> examScores3 = new ArrayList<>();
//
//        examScores1.add(100d);
//        examScores1.add(100d);
//        examScores1.add(100d);
//
//        examScores2.add(50d);
//        examScores2.add(50d);
//        examScores2.add(50d);
//
//        examScores3.add(0d);
//        examScores3.add(0d);
//        examScores3.add(0d);
//
//
//        Student student1 = new Student("Kalil", "Kennedy", examScores1);
//        Student student2 = new Student("Mike", "Bean", examScores2);
//        Student student3 = new Student("Dan", "Nelson", examScores3);
//
//
//        students = new Student[]{student1, student2};
//    }

    @Test
    void getStudents() {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(50d);
        examScores2.add(50d);
        examScores2.add(50d);

        Student student = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);

        Student[] studentArray = {student, student2};

        Classroom classroom = new Classroom(studentArray);

        Student[] expected = {student2, student};
        Student[] actual = classroom.getStudents();

        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    void getAverageExamScore() {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(50d);
        examScores2.add(50d);
        examScores2.add(50d);

        Student student = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);

        Student[] studentArray = {student, student2};

        Classroom classroom = new Classroom(studentArray);

        double actual = classroom.getAverageExamScore();
        double expected = (student.getAverageExamScore() + student2.getAverageExamScore())/2;

        assertEquals(expected, actual);
    }

    @Test
    void addStudent() {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(50d);
        examScores2.add(50d);
        examScores2.add(50d);

        Student student = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);

        Student[] studentArray = {student};

        Classroom classroom = new Classroom(studentArray);

        classroom.addStudent(student2);

        Student[] actual = classroom.getStudents();
        Student[] expected = {student, student2};

        assertArrayEquals(expected, actual);

    }

    @Test
    void removeStudent() {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(50d);
        examScores2.add(50d);
        examScores2.add(50d);

        Student student = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);

        Student[] studentArray = {student, student2};

        Classroom classroom = new Classroom(studentArray);

        classroom.removeStudent("Kalil", "Kennedy");

        Student[] expected = {student2, null};
        Student[] actual = classroom.getStudents();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getStudentsByScores() {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(50d);
        examScores2.add(50d);
        examScores2.add(50d);

        Student student = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);

        Student[] studentArray = {student, student2};

        Classroom classroom = new Classroom(studentArray);

        Student[] expected = {student, student2};
        Student[] actual = classroom.getStudentsByScores();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getGradeBook() {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();

        examScores1.add(100d);
        examScores1.add(100d);
        examScores1.add(100d);

        examScores2.add(50d);
        examScores2.add(50d);
        examScores2.add(50d);

        Student student = new Student("Kalil", "Kennedy", examScores1);
        Student student2 = new Student("Mike", "Bean", examScores2);

        Student[] studentArray = {student, student2};

        Classroom classroom = new Classroom(studentArray);

        Map<Student, Character> expected = new HashMap<>();

        expected.put(student, 'A');
        expected.put(student2, 'C');

        Map<Student, Character> actual = classroom.getGradeBook();

//        if(expected.entrySet() == actual.entrySet()){
//
//        }
        assertEquals(expected.entrySet(), actual.entrySet());

    }
}