package org.example;

import javax.swing.plaf.nimbus.State;
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
        String query = "select sname from student where sid = 1";
        ResultSet set = statement.executeQuery(query);


        System.out.println(set.next());
        System.out.println(set.getString("sname"));

        connection.close();
        System.out.println("Connection closed");


    }
}
