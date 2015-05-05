/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.Dao;


import com.model.pojo.Bookmaster;
import java.util.ArrayList;
/**
 *
 * @author Moumita
 */
//it is used for Bookmaster page
public interface Book_masterDao {
    public ArrayList<Bookmaster>getAll();
    public void delete(Bookmaster ur);
    public void edit(Bookmaster ur);
    public void insert(Bookmaster ur);
    public Bookmaster getbyid(int id);
    
    
}
