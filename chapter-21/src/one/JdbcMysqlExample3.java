package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// go to src folder in command line
//java -cp ../resources/mysql-connector-j-8.1.0.jar  one/JdbcMysqlExample.java
public class JdbcMysqlExample3 {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            try (var ps = conn.prepareStatement(insertSql)) {
                boolean result = ps.execute();
                System.out.println(result); // false
                // if result is false that refer it is not query statement.
                if (!result) {
                    int updateCount = ps.getUpdateCount();
                    System.out.println(updateCount);        //1
                }
            }

            try (var ps = conn.prepareStatement(updateSql)) {
                boolean result = ps.execute();
                System.out.println(result); // false
                if (!result) {
                    int updateCount = ps.getUpdateCount();
                    System.out.println(updateCount);        //0
                }
            }

            try (var ps = conn.prepareStatement(deleteSql)) {
                boolean result = ps.execute();
                System.out.println(result); // false
                if (!result) {
                    int updateCount = ps.getUpdateCount();
                    System.out.println(updateCount);        //1
                }
            }
        }
    }
}