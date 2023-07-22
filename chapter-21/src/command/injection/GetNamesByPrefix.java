package command.injection;

import java.sql.*;

public class GetNamesByPrefix {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void call(Connection conn) throws SQLException {
        String sql = "{call GetNamesByPrefix(?)}";
        try (CallableStatement cs = conn.prepareCall(sql)) {
            cs.setString(1, "Z");
            //cs.setString("prefix", "Z");
            try (ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
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