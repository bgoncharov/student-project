package edu.java.studentorder.validator;

import edu.java.studentorder.domain.AnswerCityRegister;
import edu.java.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public int port;
    private String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
