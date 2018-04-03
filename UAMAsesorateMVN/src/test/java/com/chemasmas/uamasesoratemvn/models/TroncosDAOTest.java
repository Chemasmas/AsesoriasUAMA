/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eva_0
 */
public class TroncosDAOTest {
    
    static Connection con;
    public TroncosDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws SQLException, ClassNotFoundException {
        con = Conexion.getConexion();
        con.setAutoCommit(false);
        
        /*Datos de Prueba*/
        
        
    }
    
    @AfterClass
    public static void tearDownClass() throws SQLException {
        con.rollback();
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of create method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testCreate() {
        System.out.println("create");
        TroncosDTO nuevo = new TroncosDTO();
        nuevo.setNombre("TEST");
        TroncosDAO dbo = new TroncosDAO();
        assertTrue( dbo.create(nuevo) );
        assertFalse( dbo.create( new TroncosDTO() ) );
        assertFalse( dbo.create( null ) );
        
    }

    /**
     * Test of get method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testGet() {
        System.out.println("get");
        long id = 0L;
        TroncosDAO instance = new TroncosDAO();
        TroncosDTO expResult = null;
        TroncosDTO result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testGetAll() {
        System.out.println("getAll");
        TroncosDAO instance = new TroncosDAO();
        List<TroncosDTO> expResult = null;
        List<TroncosDTO> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testUpdate() {
        System.out.println("update");
        TroncosDTO actualizado = null;
        TroncosDAO instance = new TroncosDAO();
        boolean expResult = false;
        boolean result = instance.update(actualizado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testDelete_TroncosDAO() {
        System.out.println("delete");
        TroncosDTO borrar = null;
        TroncosDAO instance = new TroncosDAO();
        boolean expResult = false;
        boolean result = instance.delete(borrar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testDelete_long() {
        System.out.println("delete");
        long id_borrar = 0L;
        TroncosDAO instance = new TroncosDAO();
        boolean expResult = false;
        boolean result = instance.delete(id_borrar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rawQuerySucces method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testRawQuerySucces() {
        System.out.println("rawQuerySucces");
        String query = "";
        TroncosDAO instance = new TroncosDAO();
        boolean expResult = false;
        boolean result = instance.rawQuerySucces(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rawQueryResultSet method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testRawQueryResultSet() {
        System.out.println("rawQueryResultSet");
        String query = "";
        TroncosDAO instance = new TroncosDAO();
        ResultSet expResult = null;
        ResultSet result = instance.rawQueryResultSet(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
