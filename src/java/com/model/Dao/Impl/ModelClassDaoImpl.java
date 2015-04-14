/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.Dao.Impl;

import com.model.Dao.HibernateUtil;
import com.model.Dao.ModelClassDao;
import com.model.pojo.ClassMaster;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Swarnendu
 */
public class ModelClassDaoImpl implements ModelClassDao{

    @Override
    public ArrayList<ClassMaster> getAllClass() {
       Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
       ArrayList<ClassMaster> list = new ArrayList<>();
        try {
            ses.beginTransaction();
            list = (ArrayList<ClassMaster>) ses.createCriteria(ClassMaster.class).list();
            ses.close();
            
        } catch (Exception e) {
            e.printStackTrace();
           // ses.getTransaction().rollback();
        }finally{
            return list;
        }
    }

    @Override
    public ClassMaster getClassById(int id) {
         Session ses = HibernateUtil.getSessionFactory().getCurrentSession();
          ClassMaster cm = new ClassMaster();
         try {
            ses.beginTransaction();
            cm=(ClassMaster) ses.get( ClassMaster.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
             return cm;
         }
         
    }

    @Override
    public void removeCls(ClassMaster cm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void esitCls(ClassMaster cm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createCls(ClassMaster cm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
