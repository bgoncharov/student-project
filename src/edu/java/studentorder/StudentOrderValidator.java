package edu.java.studentorder;

import edu.java.studentorder.domain.*;
import edu.java.studentorder.validator.ChildrenValidator;
import edu.java.studentorder.validator.CityRegisterValidator;
import edu.java.studentorder.validator.StudentValidator;
import edu.java.studentorder.validator.WeddingValidator;
import mail.MailSender;

public class StudentOrderValidator {
    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();

    }

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrders();

        for(int i = 0; i < soArray.length; i++) {
            System.out.println();
            checlOneOrder(soArray[i]);
        }
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];
        for(int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }

    public void checlOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
