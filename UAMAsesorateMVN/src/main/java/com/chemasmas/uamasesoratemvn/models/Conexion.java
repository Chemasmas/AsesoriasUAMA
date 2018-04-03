/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author eva_0
 */
public class Conexion {
    
    private static Connection con;
    private static Dotenv dotenv;
    private static String strCon;
    
    static {
        dotenv = Dotenv.load();
        strCon=dotenv.get("con").replace("${host}", dotenv.get("host")).replace("${db}", dotenv.get("db"));
        System.out.println(dotenv.get("driver"));
        System.out.println(dotenv.get("con"));
        System.out.println(strCon);
    }
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        if(con==null){
            Class.forName(dotenv.get("driver"));
            con = DriverManager.getConnection(strCon,dotenv.get("user"),dotenv.get("pass")); 
        }
        return con;
    }
    
}
