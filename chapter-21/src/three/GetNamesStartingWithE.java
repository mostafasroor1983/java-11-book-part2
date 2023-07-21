package three;

import java.sql.*;

public class GetNamesStartingWithE {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void call(Connection conn) throws SQLException {
        String sql = "{call GetNamesStartingWithE()}";
        try (CallableStatement cs = conn.prepareCall(sql);
             // The procedure return ResultSet so we use executeQuery
             ResultSet rs = cs.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        call(connection);
    }
}