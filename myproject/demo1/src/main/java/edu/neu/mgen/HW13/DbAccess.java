/*
 * @Author: Jinag Han
 * @Date: 2023-11-27 21:47:01
 * @Description: 
 * @LastEditTime: 2023-12-03 21:46:32
 * 
 */

package edu.neu.mgen.HW13;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * @Author: Jinag Han
 * @Date: 2023-11-27 21:47:01
 * @Description: 
 * @LastEditTime: 2023-11-27 21:54:41
 */

public class DbAccess {
    private String databaseURL;
    private String user;
    private String password;

    private Connection connect = null;

    public DbAccess() {
        Properties props = new Properties();
        try (FileInputStream in = new FileInputStream("myproject\\demo1\\database.properties")) {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        this.databaseURL = props.getProperty("db.url");
        this.user = props.getProperty("db.user");
        this.password = props.getProperty("db.password");
    }

    public Connection connectToDatabase() {
        try {
            // load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connect = DriverManager.getConnection(databaseURL, user, password);
            return connect;

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Connection to database failed");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @description: close the connection
     * @return {*}
     */
    public void close() {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (SQLException e) {
            System.out.println("Failed to close the connection");
            e.printStackTrace();
        }
    }

    /**
     * @description: query the database
     * @param {Connection} conn
     * @return {*}
     */
    public void queryDatabase(Connection conn) {
        String query = "SELECT id, name, email, password FROM users";
        try (Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Password: " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @description: update the database
     * @param {Connection} conn
     * @param {int}        userId
     * @param {String}     newName
     * @param {String}     newEmail
     * @return {*}
     */
    public void updateDatabase(Connection conn, int userId, String newName, String newEmail) {
        String update = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(update)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, newEmail);
            pstmt.setInt(3, userId);

            int affectedRows = pstmt.executeUpdate();
            System.out.println("Affected rows: " + affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            // load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connect = DriverManager.getConnection(databaseURL, user, password);
            return connect;

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection to database failed");
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Failed to close the connection");
            e.printStackTrace();
        }
    }

}
