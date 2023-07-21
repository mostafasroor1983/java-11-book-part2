package one;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcMysqlExample4 {

    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void register(Connection connection) throws SQLException {

        var sql = "INSERT INTO name VALUES(?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            //Notice how the bind variables are counted starting with 1 rather than 0.
            preparedStatement.setInt(1, 6);

            //if it is missed: SQLException: No value specified for parameter 2
            preparedStatement.setInt(2, 1);
            preparedStatement.setString(3, "Eddith");

            //SQLException: Parameter index out of range (4 > number of parameters, which is 3).
            //preparedStatement.setString(4, "Wael");
            int updatedRecords = preparedStatement.executeUpdate();
            System.out.println("updatedRecords:" + updatedRecords);
        }
    }

    static void delete(Connection connection) throws SQLException {

        var sql = "DELETE FROM name WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, 6);
            int deletedRecords = preparedStatement.executeUpdate();
            System.out.println("deletedRecords:" + deletedRecords);
        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);

        register(connection);
        delete(connection);
    }
}