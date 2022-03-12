package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "";
        String user = "";
        String pass = "";

        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(url, user, pass);
                Statement statement = connection.createStatement();
                statement.executeQuery("");
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    String courseName = resultSet.getString("");
                    System.out.println(courseName);
                }
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
