import java.sql.*;

public class SqlInjectionExample {
    public static void main(String[] args) {
        String userInput = "'; DROP TABLE users; --"; // Example of malicious input

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "user", "password");
            Statement stmt = conn.createStatement()) {

            // Vulnerable query
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("User: " + rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
