package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerChildren;
import edu.java.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("ChildrenCheck is running");
        return new AnswerChildren();
    }
}
