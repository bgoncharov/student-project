package edu.java.studentorder.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {
    private long studentOrderId;
    private Adult wife;
    private Adult husband;
    private List<Child> children;
    private String marriageCertificateId;
    private String marriageOffice;
    private LocalDate marriageDate;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public String getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
    }

    public String getMarriageOffice() {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        this.marriageOffice = marriageOffice;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public void addChild (Child child) {
        if (children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }
}
