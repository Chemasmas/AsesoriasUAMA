/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import org.hibernate.Session;
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
public class PruebasHibernate {
    
    static Session session;
    
    public PruebasHibernate() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        session.beginTransaction();
        
        
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void test1()
    {
        Troncos t = new Troncos();
        t.setNombre("ok");
        session.save(t);
        session.getTransaction().commit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
