package sql.injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatementExample {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static String query(Connection conn, String name) throws SQLException {
        String sql = "SELECT name FROM name WHERE name = ?";
        try (var stmt = conn.prepareStatement(sql)) {
            // binding variables with PreparedStatement to avoid input injection
            stmt.setString(1, name);

            try (var rs = stmt.executeQuery()) {
                String result = "";
                while (rs.next())
                    result = result + " " + rs.getString("name");
                return result;
            }

        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        System.out.println(query(connection, "Ester"));

        // bin
        System.out.println(query(connection, "Ester' OR name IS NOT NULL OR name ='Zoe"));
    }
}