/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.model;

/**
 *
 * @author Moumita
 */

import com.model.Dao.Book_masterDao;
import com.model.Dao.HibernateUtil;
import com.model.pojo.Bookmaster;

import org.hibernate.Session;
import java.util.ArrayList;

public class Book_masterModel implements Book_masterDao{
    
 @Override
  public ArrayList<Bookmaster> getAll() {
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<Bookmaster> list = new ArrayList<>();
       try {
            s.beginTransaction();
            list = (ArrayList<Bookmaster>) s.createCriteria(Bookmaster.class).list();
            s.close();
        } catch (Exception e) {
         e.printStackTrace();
        }finally{
            return list;
        }
  }
  
  @Override
    public void delete(Bookmaster ur) {
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
    public void edit(Bookmaster ur) {
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
    public void insert(Bookmaster ur) {
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
    
  public Bookmaster getbyid(int id) {
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      Bookmaster ur = new Bookmaster();
      try {
            s.beginTransaction();
            ur =(Bookmaster)s.get(Bookmaster.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }finally{
      return ur;
      }
    }  
}
