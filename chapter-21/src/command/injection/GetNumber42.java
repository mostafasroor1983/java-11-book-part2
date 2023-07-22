package command.injection;

import java.sql.*;

public class GetNumber42 {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void call(Connection conn) throws SQLException {
        //var sql = "{?= call GetNumber42(?) }";
        var sql = "{call GetNumber42(?) }";
        try (var cs = conn.prepareCall(sql)) {
            //Remember to always call registerOutParameter() for each OUT or INOUT
            //parameter (which we will cover next).
            cs.registerOutParameter(1, Types.INTEGER);

            //we call execute() instead of executeQuery() since
            //we are not returning a ResultSet from our stored procedure.
            cs.execute();
            System.out.println(cs.getInt("number42"));
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