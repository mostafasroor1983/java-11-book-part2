package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcMysqlExample9 {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void query(Connection conn) throws SQLException {
        var sql = "SELECT name FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            while (rs.next()) {
                String name = (String) rs.getObject(1);
                System.out.println("name:" + name);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        query(connection);
    }
}