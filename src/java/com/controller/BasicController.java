/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Dao.Impl.ModelClassDaoImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Swarnendu
 */
@Controller
public class BasicController {
    
    @RequestMapping(value = "/getAllCls",method = RequestMethod.GET)
    public String getAllCls (Model m){
        ModelClassDaoImpl mcd = new ModelClassDaoImpl();
        m.addAttribute("lst",mcd.getAllClass());
        
        return "getAllcls";
        
    }
}
