package edu.java.studentorder.validator;

import edu.java.studentorder.domain.CityRegisterCheckerResponse;
import edu.java.studentorder.domain.Person;

public interface CityRegisterChecker {
    public CityRegisterCheckerResponse checkPerson(Person person);
}
