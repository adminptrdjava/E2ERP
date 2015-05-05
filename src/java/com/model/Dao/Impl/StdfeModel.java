/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.model;

import com.model.Dao.StdfeDao;
import com.model.pojo.StudentFeesDetails;

import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author DIPAK
 */
/*THIS MODEL IS FOR STUDENT FEES DETAILS*/
public class StdfeModel implements StdfeDao {

    @Override
    public ArrayList<StudentFeesDetails> getall() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        ArrayList<StudentFeesDetails> list = new ArrayList<>();
        try {
            System.out.println("OUTPUT ON GETALL");
            s.beginTransaction();
            list = (ArrayList<StudentFeesDetails>) s.createCriteria(StudentFeesDetails.class).list();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            return list;
        }
    }

    @Override
    public void delete(StudentFeesDetails sd) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(sd);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void edit(StudentFeesDetails sd) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(sd);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();

        }
    }

    @Override
    public void insert(StudentFeesDetails sd) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(sd);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public StudentFeesDetails getbyid(int id) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        StudentFeesDetails sf = new StudentFeesDetails();
        try {
            s.beginTransaction();
            sf = (StudentFeesDetails) s.get(StudentFeesDetails.class, id);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            return sf;
        }
    }

}
