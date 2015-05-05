/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.Dao;


import com.model.pojo.BookReturn;
import java.util.ArrayList;

/**
 *
 * @author Moumita
 */
public interface Book_returnDao {
    public ArrayList<BookReturn>getAll();
    public void delete(BookReturn ur);
    public void edit(BookReturn ur);
    public void insert(BookReturn ur);
    public BookReturn getbyid(int id);
    
    
    
    
}
