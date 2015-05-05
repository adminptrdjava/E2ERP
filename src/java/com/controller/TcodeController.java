/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Swarnendu
 */
@Controller
public class TcodeController {
    @RequestMapping(value = "/getTcode",method = RequestMethod.POST)
    public String genarateTcode(@ModelAttribute(value = "Tc")String Tc,BindingResult result,Model m){
        
        if(Tc.equals("clsdtl")||Tc.equals("CLSDTL")){
             return "redirect:getAllCls.htm";
        }
            
        
        else{
         m.addAttribute("TCE","TCODE ERROR/ Tcode:"+Tc);
         return "index";
        }
         
    }
}
