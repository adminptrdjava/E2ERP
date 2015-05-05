/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.Dao;

import com.model.pojo.StudentFeesDetails;
import java.util.ArrayList;

/**
 *
 * @author DIPAK
 */
/*THIS INTERFACE IS FOR STUDENT FEES DETAILS*/
public interface StdfeDao {

    public ArrayList<StudentFeesDetails> getall();

    public void delete(StudentFeesDetails sd);

    public void edit(StudentFeesDetails sd);

    public void insert(StudentFeesDetails sd);

    public StudentFeesDetails getbyid(int id);

}
