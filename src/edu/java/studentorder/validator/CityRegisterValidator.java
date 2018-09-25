package edu.java.studentorder.validator;

import edu.java.studentorder.domain.Child;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.domain.register.AnswerCityRegister;
import edu.java.studentorder.domain.register.AnswerCityRegisterItem;
import edu.java.studentorder.domain.register.CityRegisterResponse;
import edu.java.studentorder.domain.StudentOrder;
import edu.java.studentorder.exception.CityRegisterException;


public class CityRegisterValidator {

    public String hostName;
    public int port;
    private String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();

        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem((checkPerson(so.getWife())));
        for(Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }
        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        try {
            CityRegisterResponse cans = personChecker.checkPerson(person);
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
