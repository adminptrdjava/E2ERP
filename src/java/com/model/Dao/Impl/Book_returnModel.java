/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.model;

import com.model.Dao.Book_returnDao;
import com.model.Dao.HibernateUtil;
import com.model.pojo.BookReturn;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Moumita
 */
public class Book_returnModel implements Book_returnDao{
    @Override
  public ArrayList<BookReturn> getAll() {
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<BookReturn> list = new ArrayList<>();
       try {
            s.beginTransaction();
            list = (ArrayList<BookReturn>) s.createCriteria(BookReturn.class).list();
            s.close();
        } catch (Exception e) {
         e.printStackTrace();
        }finally{
            return list;
        }
  }
  
  @Override
    public void delete(BookReturn ur) {
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
    public void edit(BookReturn ur) {
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
    public void insert(BookReturn ur) {
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
    
  public BookReturn getbyid(int id) {
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      BookReturn ur = new BookReturn();
      try {
            s.beginTransaction();
            ur =(BookReturn)s.get(BookReturn.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }finally{
      return ur;
      }
    }  
    
    
}
