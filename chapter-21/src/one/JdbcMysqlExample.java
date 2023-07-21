package one;

import java.sql.*;

// go to src folder in command line
//java -cp ../resources/mysql-connector-j-8.1.0.jar  one/JdbcMysqlExample.java
public class JdbcMysqlExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/zoodb";
        String username = "root";
        String password = "";

        String query = "SELECT * FROM exhibits";

        // all of them throw SQLException
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet resultSet = ps.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double num_acres = resultSet.getDouble("num_acres");
                System.out.println("Exhibits ID: " + id + ", Name: " + name + ", Num: " + num_acres);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}