package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "123456789");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class OracleConnection {
//    public static void main(String[] args) {
//        // JDBC URL, username, and password of Oracle database
//        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//        String user = "system";
//        String password = "123456789";
//
//        // JDBC variables for opening, closing, and managing connection
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            System.out.println("Connected to Oracle Database");
//            // Perform database operations here
//
//        } catch (SQLException e) {
//            System.out.println("Connection Failed! Check output console");
//            e.printStackTrace();
//        }
//    }
//}
//
