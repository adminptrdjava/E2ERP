/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.model;

import com.model.Dao.BookissueDao;
import com.model.Dao.HibernateUtil;
import com.model.pojo.BookIssuemaster;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Moumita
 */
public class Bookissue_model implements BookissueDao{
 
    @Override
  public ArrayList<BookIssuemaster> getAll() {
       Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<BookIssuemaster> list = new ArrayList<>();
       try {
            s.beginTransaction();
            list = (ArrayList<BookIssuemaster>) s.createCriteria(BookIssuemaster.class).list();
            s.close();
        } catch (Exception e) {
         e.printStackTrace();
        }finally{
            return list;
        }
  }
  
  @Override
    public void delete(BookIssuemaster ur) {
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
    public void edit(BookIssuemaster ur) {
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
    public void insert(BookIssuemaster ur) {
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
    
  public BookIssuemaster getbyid(int id) {
      Session s = HibernateUtil.getSessionFactory().getCurrentSession();
      BookIssuemaster ur = new BookIssuemaster();
      try {
            s.beginTransaction();
            ur =(BookIssuemaster)s.get(BookIssuemaster.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }finally{
      return ur;
      }
    }  
    
}

    

