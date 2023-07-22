package sql.injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StatementInjectionExample {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static String query(Connection conn, String name) throws SQLException {
        String sql = "SELECT name FROM name WHERE name = '" + name + "'";
        try (var stmt = conn.createStatement();
             var rs = stmt.executeQuery(sql)) {
            String result = "";
            while (rs.next())
                result = result + " " + rs.getString("name");
            return result;
        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        System.out.println(query(connection, "Ester"));

        // injection => hacking the parameter to inject
        System.out.println(query(connection, "Ester' OR name IS NOT NULL OR name ='Zoe"));
    }
}