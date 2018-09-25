package edu.java.studentorder.validator;

import edu.java.studentorder.domain.CityRegisterCheckerResponse;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}