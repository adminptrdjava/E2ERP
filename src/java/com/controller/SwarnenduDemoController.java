/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Swarnendu
 */
@Controller
public class SwarnenduDemoController {
    
    @RequestMapping (value = "/Demo", method = RequestMethod.GET)
    public String mydemo (Model m){
        
        String Msg = "HI THIS IS DEMO";
        m.addAttribute("msg",Msg);
        return "scdemo";
    } 
    @RequestMapping (value = "/Devloper/{name}", method = RequestMethod.GET)
    public String devloperget (@PathVariable("name")String n,Model m){
        String Msg = "";
        if(n.equals("sc")||n.equals("mith")||n.equals("sm")){
            Msg="HI DEVELOPER:"+n;
        }else{
            Msg = "YOU ARE NOT VALID DEVELOPER";
        }
        m.addAttribute("msg",Msg);
        return "scdemo";
        
    }
}
