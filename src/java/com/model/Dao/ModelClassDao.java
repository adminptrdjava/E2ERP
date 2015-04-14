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
 * @author Swarnendu
 */
public interface ModelClassDao {
  public ArrayList<ClassMaster>getAllClass();
  public ClassMaster getClassById(int id);
  public void removeCls(ClassMaster cm);
  public void esitCls(ClassMaster cm);
  public void createCls(ClassMaster cm);
}
