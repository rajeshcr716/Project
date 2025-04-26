import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCheck {
    public static void main(String[] args) {
        // Change these as per your DB setup
        String url = "jdbc:mysql://localhost:3306/hpsa";
        String username = "root";
        String password = "root";

        try {
            // Load MySQL JDBC Driver (optional for newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Attempt connection
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("✅ Connection successful!");
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
