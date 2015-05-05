/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.model.Dao.ClsmtDao;
import com.model.pojo.ClassMaster;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author DIPAK
 */
/*
 THIS IS THE MODEL FOR CALSS REGISTRATION
 */
public class ClsmtModel implements ClsmtDao {

    @Override
    public ArrayList<ClassMaster> getall() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<ClassMaster> list = new ArrayList<>();
        try {
            System.out.println("OUTPUT ON GETALL");
            s.beginTransaction();
            list = (ArrayList<ClassMaster>) s.createCriteria(ClassMaster.class).list();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            return list;
        }
    }

    @Override
    public void delete(ClassMaster clm) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(clm);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void edit(ClassMaster clm) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(clm);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void insert(ClassMaster clm) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(clm);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public ClassMaster getbyid(int id) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ClassMaster clm = new ClassMaster();
        try {
            s.beginTransaction();
            clm = (ClassMaster) s.get(ClassMaster.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            return clm;
        }
    }

}
