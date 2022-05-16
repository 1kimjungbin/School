package Score;

import java.util.ArrayList;

public class Student {
    int StudentID;
    String StudentName;

    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.StudentID = studentID;
        this.StudentName = studentName;
        Subject subject = new Subject();
    }
}
