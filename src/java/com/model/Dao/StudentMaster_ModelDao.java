/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.Dao;

import com.model.pojo.Studentmaster;
import java.util.ArrayList;

/**
 *
 * @author Swarnendu
 */
public interface StudentMaster_ModelDao {
    public ArrayList<Studentmaster> getAllstud();
    public Studentmaster getBySid(int sid);
    public void delStud(Studentmaster sm);
    public void editStud(Studentmaster sm);
   
    
}
