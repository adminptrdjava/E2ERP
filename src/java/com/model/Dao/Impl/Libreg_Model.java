/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.model;
import com.model.Dao.HibernateUtil;
import com.model.Dao.LibregDao;
import com.model.pojo.LiberyReg;
//import com.demo.entity.LiberyReg;
import org.hibernate.Session;
import java.util.ArrayList;

/**
 *
 * @author Moumita
 */
public class Libreg_Model implements LibregDao{
    @Override
  public ArrayList<LiberyReg> getAll() {
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<LiberyReg> list = new ArrayList<>();
       try {
            s.beginTransaction();
            list = (ArrayList<LiberyReg>) s.createCriteria(LiberyReg.class).list();
            s.close();
        } catch (Exception e) {
         e.printStackTrace();
        }finally{
            return list;
        }
  }
  
  @Override
    public void delete(LiberyReg ur) {
         Session s  = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete( ur);
            s.getTransaction().commit();
        } catch (Exception e) {
             e.printStackTrace();
        s.getTransaction().rollback();
       
        
        }
    }

    @Override
    public void edit(LiberyReg ur) {
    Session s  = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(ur);
            s.getTransaction().commit();
        } 
        catch (Exception e) {
        s.getTransaction().rollback();
        e.printStackTrace();
        
        }
    }

    @Override
    public void insert(LiberyReg ur) {
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(ur);
            s.getTransaction().commit();
        } catch (Exception e) {
          s.getTransaction().rollback();
          e.printStackTrace();
        }
        
    }
  
  @Override
    
  public LiberyReg getbyid(int id) {
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      LiberyReg ur = new LiberyReg();
      try {
            s.beginTransaction();
            ur =(LiberyReg)s.get(LiberyReg.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }finally{
      return ur;
      }
    }  
    
}
