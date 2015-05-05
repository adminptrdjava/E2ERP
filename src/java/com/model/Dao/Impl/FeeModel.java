/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.model.Dao.FeeDao;
import com.model.pojo.FeesMaster;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author DIPAK /*THIS IS MODEL CLASS FOR FEES MASTER
 */
public class FeeModel implements FeeDao {

    @Override
    public ArrayList<FeesMaster> getall() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<FeesMaster> list = new ArrayList<>();
        try {
            System.out.println("OUTPUT ON GETALL");
            s.beginTransaction();
            list = (ArrayList<FeesMaster>) s.createCriteria(FeesMaster.class).list();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            return list;
        }
    }

    @Override
    public void delete(FeesMaster fm) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(fm);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void edit(FeesMaster fm) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(fm);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void insert(FeesMaster fm) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(fm);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public FeesMaster getbyid(int id) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        FeesMaster fm = new FeesMaster();
        try {
            s.beginTransaction();
            fm = (FeesMaster) s.get(FeesMaster.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            return fm;
        }

    }

}
