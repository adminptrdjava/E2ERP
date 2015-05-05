/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.model.Dao.FineDao;
import com.model.pojo.Finesetting;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author DIPAK
 */
/*THIS IS MODEL FOR FINE SETTING*/
public class FineModel implements FineDao {

    @Override
    public ArrayList<Finesetting> getall() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<Finesetting> list = new ArrayList<>();
        try {
            System.out.println("OUTPUT ON GETALL");
            s.beginTransaction();
            list = (ArrayList<Finesetting>) s.createCriteria(Finesetting.class).list();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            return list;
        }
    }

    @Override
    public void delete(Finesetting fs) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(fs);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void edit(Finesetting fs) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(fs);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void insert(Finesetting fs) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(fs);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public Finesetting getbyid(int id) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Finesetting fs = new Finesetting();
        try {
            s.beginTransaction();
            fs = (Finesetting) s.get(Finesetting.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            return fs;
        }

    }

}
