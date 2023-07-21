package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JdbcMysqlExample7 {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void query(Connection conn) throws SQLException {
        String sql = "SELECT id, name FROM exhibits";
        Map<Integer, String> idToNameMap = new HashMap<>();

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                //You can use an index instead of a column name.even though column names are better for readability
                //The index counting start with 1 rather than 0
                int id = rs.getInt(1);         //id
                String name = rs.getString(2); //name
                idToNameMap.put(id, name);
            }

            System.out.println(idToNameMap);
        }
    }

    static void count(Connection conn) throws SQLException {
        String sql = "SELECT count(*) as count FROM name";
        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                //Attempting to access a column name or index that does not exist throws a SQLException,
                // s does getting data from a ResultSet when it isn't pointing at a valid row.
                //SQLException: Column 'total' not found.
                //int count = rs.getInt("total");
                int count = rs.getInt("count");
                System.out.println("count:" + count);
            }

        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        query(connection);
        count(connection);
    }
}