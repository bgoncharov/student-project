package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerWedding;
import edu.java.studentorder.domain.StudentOrder;

public class WeddingValidator {

    String couple;
    String status;

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("WeddingCheck is running: " + couple + status);
        AnswerWedding ans = new AnswerWedding();
        return ans;
    }
}
