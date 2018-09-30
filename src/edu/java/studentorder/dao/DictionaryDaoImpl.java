package edu.java.studentorder.dao;

import edu.java.studentorder.domain.Street;
import edu.java.studentorder.exception.DaoException;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionaryDaoImpl implements DictionaryDao
{
    private final static String GET_SREET = "SELECT street_code, street_name " +
            "FROM jc_street WHERE UPPER(street_name) LIKE UPPER(?)";
    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/jc_student",
                "postgres", "postgres");
        return con;
    }

    public List<Street> findStreets(String pattern) throws DaoException {
        List<Street> result = new LinkedList<>();


        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(GET_SREET)) {

            stmt.setString(1, "%" + pattern + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Street str = new Street(rs.getLong("street_code"),
                        rs.getString("street_name"));
                result.add(str);
            }
        } catch (SQLException ex) {
            throw new DaoException(ex);
        }

        return result;
    }
}