package com.example;

/**
 * Hello world!
 *
 */
import java.sql.*;

public class App 
{
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Vignesh@2406";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            String query = "Insert into student(id,Name) values(101,'ram')";
            Statement statement = connection.createStatement();
            statement.execute(query);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
} 

 
