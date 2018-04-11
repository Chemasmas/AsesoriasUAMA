/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import java.util.Arrays;
import java.util.List;
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
        session.getTransaction().commit();
    }
    
    
    @Test
    public void insert()
    {
        Troncos t = new Troncos();
        t.setNombre("ok2");
        session.save(t);
        System.out.println(t.getNombre());
        System.out.println("Guardado!!");
    }
    /*
    @Test
    public void delete()
    {
        Troncos t = new Troncos();
        t.setNombre("ok3");
        session.save(t);
        
        
        Troncos t2  = (Troncos)session.byId(Troncos.class).load();
        //session.delete(t);
        
        System.out.println("Eliminando!!");
    }*/
    
    
    @Test
    public void select(){
        
        //Divisiones i = new Divisiones();
        System.out.println("Select");
        List<Troncos> lt = session.createCriteria(Troncos.class).list();
        
//        session.byId(Troncos.class)
        System.out.println((lt));
        System.out.println("Fin Select");
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
