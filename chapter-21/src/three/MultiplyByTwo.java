package three;

import java.sql.*;

public class MultiplyByTwo {
    static Connection connect(String jdbcUrl, String username, String password) throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    static void call(Connection conn) throws SQLException {
        //? For IN parameter
        var sql = "{call MultiplyByTwo(?) }";
        try (var cs = conn.prepareCall(sql)) {
            // For IN parameter
            cs.setInt(1, 100);

            //For an OUT parameter, this is required to register the parameter.
            cs.registerOutParameter(1, Types.INTEGER);

            //uses execute() again because we are not returning a ResultSet.
            cs.execute();
            System.out.println(cs.getInt("inputNumber"));
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