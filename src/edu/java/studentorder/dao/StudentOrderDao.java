package edu.java.studentorder.dao;

import edu.java.studentorder.domain.StudentOrder;
import edu.java.studentorder.exception.DaoException;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;
}
