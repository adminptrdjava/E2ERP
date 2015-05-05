/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Dao.Impl.StudentMaster_ModelDaoI_Impl;
import com.model.pojo.Studentmaster;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Swarnendu
 */

/*
THIS IS THE MAIN CONTROLLER WHICH HANDEL STUDENT REGISTRATION 


*/
@Controller
public class StudentRegistrationController {
    
    @RequestMapping(value = "/getAllStu",method = RequestMethod.GET)
    public String getAllStud(Model m){
       //  ArrayList<Studentmaster> list = new ArrayList<Studentmaster>();
        StudentMaster_ModelDaoI_Impl stdDao = new StudentMaster_ModelDaoI_Impl();
         m.addAttribute("lst",stdDao.getAllstud());
         return "getAllStu";
    }
}
