/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chemasmas.uamasesoratemvn.models;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author eva_0
 * @param <T> DAO sobre el que se hara el CRUD
 */
public interface CRUD<T> {
    public boolean create(T nuevo);
    
    public T get(long id);
    public List<T> getAll();
    
    public boolean update(T actualizado);
    
    public boolean delete(T borrar);
    public boolean delete(long id_borrar);
    
    public boolean rawQuerySucces(String query);
    public ResultSet rawQueryResultSet(String query);
}
