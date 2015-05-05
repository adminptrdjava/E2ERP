/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.Dao;

/**
 *
 * @author Moumita
 */

import com.model.pojo.BookIssuemaster;
import java.util.ArrayList;
public interface BookissueDao {
    public ArrayList<BookIssuemaster>getAll();
    public void delete(BookIssuemaster ur);
    public void edit(BookIssuemaster ur);
    public void insert(BookIssuemaster ur);
    public BookIssuemaster getbyid(int id);
    
}
