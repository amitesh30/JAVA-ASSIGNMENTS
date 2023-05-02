

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConnect {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            int result = statement.executeUpdate("INSERT INTO sys (name, age, gender) VALUES ('Arjun', 19,'Male')");
            int result2 = statement.executeUpdate("UPDATE sys SET name='Arjun Tyagi', age=20, gender='Male' WHERE id=3");

            display(statement);

            connection.close();
        }
        catch (Exception e) {
            System.out.println("Where is your MySQL JDBC Driver?" + "\n" + e);
            e.printStackTrace();
            return;
        }
    }

    public static void display(Statement statement){
        try{
            ResultSet resultSet = statement.executeQuery("SELECT * FROM sys");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getString(4));
            }
        } catch (Exception e) {
            System.out.println("Error displaying data: " + e.getMessage());
        }
    }
}