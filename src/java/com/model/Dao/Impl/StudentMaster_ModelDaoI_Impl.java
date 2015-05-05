/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.Dao.Impl;

import com.model.Dao.HibernateUtil;
import com.model.Dao.StudentMaster_ModelDao;
import com.model.pojo.Studentmaster;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Swarnendu
 */
public class StudentMaster_ModelDaoI_Impl implements StudentMaster_ModelDao{

    @Override
    public ArrayList<Studentmaster> getAllstud() {
        Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<Studentmaster> list = new ArrayList<Studentmaster>();
        try {
            ses.beginTransaction();
            list = (ArrayList<Studentmaster>) ses.createCriteria(Studentmaster.class).list();
            ses.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return list;
        }
        
    }

    @Override
    public Studentmaster getBySid(int sid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delStud(Studentmaster sm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editStud(Studentmaster sm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
