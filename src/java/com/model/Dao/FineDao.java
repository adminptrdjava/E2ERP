/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.Dao;

import com.model.pojo.Finesetting;
import java.util.ArrayList;

/**
 *
 * @author DIPAK
 */
/*THIS IS INTERFACE FOR FINESETTINGS*/
public interface FineDao {

    public ArrayList<Finesetting> getall();

    public void delete(Finesetting fs);

    public void edit(Finesetting fs);

    public void insert(Finesetting fs);

    public Finesetting getbyid(int id);

}
