package edu.java.studentorder.validator;

import edu.java.studentorder.domain.student.AnswerStudent;
import edu.java.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("StudentCheck is running");
        return new AnswerStudent();
    }
}
