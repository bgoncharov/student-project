package edu.java.studentorder.validator;

import edu.java.studentorder.domain.register.CityRegisterResponse;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}