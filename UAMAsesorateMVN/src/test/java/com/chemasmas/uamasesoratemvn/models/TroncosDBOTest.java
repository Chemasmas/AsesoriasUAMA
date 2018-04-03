/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import java.sql.ResultSet;
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
public class TroncosDBOTest {
    
    public TroncosDBOTest() {
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
     * Test of create method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testCreate() {
        System.out.println("create");
        TroncosDAO nuevo = new TroncosDAO();
        nuevo.setNombre("TEST");
        TroncosDBO dbo = new TroncosDBO();
        assertTrue( dbo.create(nuevo) );
        assertFalse( dbo.create( new TroncosDAO() ) );
        assertFalse( dbo.create( null ) );
        
    }

    /**
     * Test of get method, of class TroncosDBO.
     */
    @org.junit.Test
    public void testGet() {
        System.out.println("get");
        long id = 0L;
        TroncosDBO instance = new TroncosDBO();
        TroncosDAO expResult = null;
        TroncosDAO result = instance.get(id);
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
        TroncosDBO instance = new TroncosDBO();
        List<TroncosDAO> expResult = null;
        List<TroncosDAO> result = instance.getAll();
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
        TroncosDAO actualizado = null;
        TroncosDBO instance = new TroncosDBO();
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
        TroncosDAO borrar = null;
        TroncosDBO instance = new TroncosDBO();
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
        TroncosDBO instance = new TroncosDBO();
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
        TroncosDBO instance = new TroncosDBO();
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
        TroncosDBO instance = new TroncosDBO();
        ResultSet expResult = null;
        ResultSet result = instance.rawQueryResultSet(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
