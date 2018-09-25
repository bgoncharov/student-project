package edu.java.studentorder.validator;

import edu.java.studentorder.domain.Adult;
import edu.java.studentorder.domain.Child;
import edu.java.studentorder.domain.register.CityRegisterResponse;
import edu.java.studentorder.domain.Person;
import edu.java.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker{

    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1001";
    private static final String ERROR_2 = "2002";

    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException {

        CityRegisterResponse res = new CityRegisterResponse();

        if(person instanceof Adult) {
            Adult t = (Adult) person;
            String ps = t.getPassportSeria();
            if(ps.equals(GOOD_1) || ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if(ps.equals(BAD_1) || ps.equals(BAD_2)) {
                res.setExisting(false);
            }
            if(ps.equals(ERROR_1) || ps.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("Fake Error");
                throw ex;
            }
        }

        if(person instanceof Child) {
            res.setExisting(true);
            res.setTemporal(true);
        }

        System.out.println(res);

        return res;
    }
}
