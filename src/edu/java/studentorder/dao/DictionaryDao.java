package edu.java.studentorder.dao;

import edu.java.studentorder.domain.Street;
import edu.java.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
}
