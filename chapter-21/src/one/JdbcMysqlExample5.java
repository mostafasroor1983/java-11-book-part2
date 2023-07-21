package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcMysqlExample5 {

    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void register(Connection connection) throws SQLException {

        var sql = "INSERT INTO name VALUES(?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            //Notice how the bind variables are counted starting with 1 rather than 0.
            preparedStatement.setInt(1, 6);
            preparedStatement.setInt(2, 1);
            preparedStatement.setString(3, "Eddith");

            int updatedRecords3 = preparedStatement.executeUpdate();
            System.out.println("updatedRecords:" + updatedRecords3);

            //The PreparedStatement is smart enough to remember the parameters that were already set and retain them.
            //You only have to set the ones that are different.
            preparedStatement.setInt(1, 7);

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
       // delete(connection);
    }
}