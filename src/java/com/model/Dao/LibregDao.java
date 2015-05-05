/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.Dao;


import com.model.pojo.LiberyReg;
import java.util.ArrayList;

/**
 *
 * @author Moumita
 */
public interface LibregDao {
    public ArrayList<LiberyReg>getAll();
    public void delete(LiberyReg ur);
    public void edit(LiberyReg ur);
    public void insert(LiberyReg ur);
    public LiberyReg getbyid(int id);
    
}
