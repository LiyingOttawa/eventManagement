/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glily
 */
public class DBConnectionTest {
    
    public DBConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class DBConnection.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DBConnection expResult = DBConnection.getInstance();
        DBConnection result = DBConnection.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConnection method, of class DBConnection.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        DBConnection instance = DBConnection.getInstance();
        Connection expResult = instance.getConnection();
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
    }

    /**
     * Test of closeConnection method, of class DBConnection.
     */
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        DBConnection instance = DBConnection.getInstance();
        Connection expResult = instance.getConnection();
        instance.closeConnection();
        Connection result = instance.getConnection();
        assertNotEquals(expResult, result);
    }
    
}
