package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class JdbcMysqlExample6 {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void register(Connection conn, int firstKey,
                         int type, String... names) throws SQLException {
        var sql = "INSERT INTO name VALUES(?, ?, ?)";
        var nextIndex = firstKey;
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);
            for (var name : names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();
                nextIndex++;
            }

            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        String[] names = new String[]{"A", "B", "C", "D"};
        register(connection, 10, 2, "A", "B", "C", "D");
    }
}