package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class JdbcMysqlExample8 {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void query(Connection conn) throws SQLException {
        var sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            //Not calling rs.next() at all is a problem. The result set cursor is
            //still pointing to a location before the first row, so the getter have nothing to point to.
            rs.getInt(1); // SQLException: Before start of result set
        }
    }

    static void query2(Connection conn) throws SQLException {
        var sql = "SELECT * FROM exhibits where name='Not in table'";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            rs.next();
            rs.getInt(1); // SQLException: Illegal operation on empty result set.
        }
    }

    static void query3(Connection conn) throws SQLException {
        var sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next())
                rs.getInt(0); // SQLException: Column Index out of range, 0 < 1.
        }
    }

    static void query4(Connection conn) throws SQLException {
        var sql = "SELECT name FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next())
                rs.getInt("badColumn"); // SQLException: Column 'badColumn' not found.
        }
    }

    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        Connection connection = connect(jdbcUrl, username, password);
        //query(connection);
        //query2(connection);
        //query3(connection);
        query4(connection);
    }
}