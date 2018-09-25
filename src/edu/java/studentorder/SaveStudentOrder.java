package edu.java.studentorder;

import edu.java.studentorder.domain.Address;
import edu.java.studentorder.domain.Adult;
import edu.java.studentorder.domain.Child;
import edu.java.studentorder.domain.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder s = buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("NY dmv");

        Address address = new Address("11214", "77th street", "1865", "", "B7");

        // Муж
        Adult husband = new Adult("Johnson", "Den", "Jr", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Police dept: " + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Adams", "Kate", "MD", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Poloce dept: " + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child1 = new Child("Johnson", "Boris", "JR", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        child1.setIssueDepartment("DMV: " + id);
        child1.setAddress(address);

        // Ребенок
        Child child2 = new Child("Johnson", "Bella", "JR", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (400000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        child2.setIssueDepartment("DMV: " + id);
        child2.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }
}