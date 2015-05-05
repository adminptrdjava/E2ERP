/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.Dao;


import com.model.pojo.ClassMaster;
import java.util.ArrayList;

/**
 *
 * @author DIPAK
 */
/*
THIS IS THE INTERFACE DAO FOR CLASS REGISTRATION
*/

public interface ClsmtDao {
public ArrayList<ClassMaster>getall();
public void delete(ClassMaster clm);
public void edit(ClassMaster clm);
public void insert(ClassMaster clm);
public ClassMaster getbyid(int id);
}
