/**
 * File name: DBConnection.java
 * Author: Liying Guo, 040858257
 * Course: CST8288 OOP with Design Patterns
 * Assignment: Assignment2
 * Date: 2024-02-17
 * Professor: Gustavo Adami
 * Purpose: DBConnection is a singleton class
 */
package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * This class should manage the creation of a single instance of the database connection.
 * @author Liying Guo
 * @version 1.0
 * @since 2024-Feb-17
 */
public class DBConnection {
	private static DBConnection singleton;
	public static Connection connection = null;
	
	private final String serverUrl = "jdbc:mysql://localhost:3306/bookvault";
	private final String userString = "root";
	private final String passwordString = "root";
	//private final String driverString = "com.mysql.cj.jdbc.Driver";
	
        private DBConnection()
        { 
        }
        
        public static DBConnection getInstance()
        {
            if(singleton == null)
            {
                singleton = new DBConnection();
            }
            return singleton;
        }
        
        public Connection getConnection() throws SQLException
        {
            if(connection == null)
            {
               connection = DriverManager.getConnection( serverUrl, userString, passwordString );
            }
            
            return connection;
        }
        
        public void closeConnection() throws SQLException
        {
            if(connection != null)
            {
               connection.close();
            }
            
            connection = null;
        }

}
