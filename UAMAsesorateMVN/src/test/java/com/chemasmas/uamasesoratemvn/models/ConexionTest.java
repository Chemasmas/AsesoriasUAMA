/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
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
public class ConexionTest {
    
    public ConexionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //Dotenv env = Dotenv.load();
        //System.out.println(env.get("driver"));
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
     * Test of getConexion method, of class Conexion.
     */
    @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        Connection result = Conexion.getConexion();
        assertNotNull(result);
    }
    
}
