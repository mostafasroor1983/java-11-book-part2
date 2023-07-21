package one;

import java.sql.*;

// go to src folder in command line
//java -cp ../resources/mysql-connector-j-8.1.0.jar  one/JdbcMysqlExample.java
public class JdbcMysqlExample2 {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            try (var ps = conn.prepareStatement(insertSql)) {
                int result = ps.executeUpdate();
                System.out.println(result); // 1
            }

            try (var ps = conn.prepareStatement(updateSql)) {
                int result = ps.executeUpdate();
                System.out.println(result); // 0
            }

            try (var ps = conn.prepareStatement(deleteSql)) {
                int result = ps.executeUpdate();
                System.out.println(result); // 1
            }
        }


    }
}