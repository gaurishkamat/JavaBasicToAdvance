package org.example;

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception{

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String username = "postgres";
        String password = "2305";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established");
        Statement statement = connection.createStatement();
        String query = "select * from student";
        ResultSet set = statement.executeQuery(query);


        while (set.next()){
            System.out.print(set.getInt("sid") + " " + set.getString("sname") + " " + set.getInt("marks") + "\n" );
        }

        connection.close();
        System.out.println("Connection closed");


    }
}
