/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.Dao;

import com.model.pojo.FeesMaster;
import java.util.ArrayList;

/**
 *
 * @author DIPAK
 */
/*THIS IS THE INTERFACE FOR FINE MASTER*/
public interface FeeDao {

    public ArrayList<FeesMaster> getall();

    public void delete(FeesMaster fm);

    public void edit(FeesMaster fm);

    public void insert(FeesMaster fm);

    public FeesMaster getbyid(int id);

}
