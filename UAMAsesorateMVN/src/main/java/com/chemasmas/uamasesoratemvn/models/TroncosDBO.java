/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eva_0
 */
public class TroncosDBO implements CRUD<TroncosDAO> {

    private static final String INSERT = "INSERT INTO `troncos`(`nombre`) VALUES(?)";
    
    
    @Override
    public boolean create(TroncosDAO nuevo) {
        if(nuevo == null || nuevo.getNombre() == null || nuevo.getNombre().equals(""))
            return false;
        
        try {
            PreparedStatement pstm = Conexion.getConexion().prepareStatement(INSERT);
            pstm.setString(1, nuevo.getNombre());
            pstm.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TroncosDBO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public TroncosDAO get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TroncosDAO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TroncosDAO actualizado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(TroncosDAO borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(long id_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rawQuerySucces(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet rawQueryResultSet(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
