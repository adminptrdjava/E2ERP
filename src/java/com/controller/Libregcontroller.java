/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.controller;

import com.demo.model.Libreg_Model;
import com.model.pojo.LiberyReg;

import javax.validation.Valid;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Moumita
 */
@Controller
public class Libregcontroller  {
    @RequestMapping(value = "/libregdtl",method = RequestMethod.GET)
     public String getAll(Model m){
        Libreg_Model sm = new Libreg_Model();
       m.addAttribute("lst",sm.getAll());
        return "Libreg_master" ;
    
        }    
    @RequestMapping(value = "/dellib",method = RequestMethod.GET)
    public  String delete(@RequestParam (value = "id")int id){
      Libreg_Model sm =new Libreg_Model();
     LiberyReg ur =new LiberyReg();
      ur=sm.getbyid(id);
      sm.delete(ur);
      return "redirect:libregdtl.htm";    
    }
    
    @RequestMapping(value = "/edtlib",method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id")int id,Model m){
    Libreg_Model sm = new Libreg_Model();
    LiberyReg ur = new LiberyReg();
    ur=sm.getbyid(id);
    m.addAttribute("ur",ur);
    return "libreg_edit";
    }
    
     @RequestMapping(value = "/updatelib",method = RequestMethod.POST)
    public String update(@Valid@ModelAttribute(value = "lib")LiberyReg bkm,BindingResult result,Model m){
    Libreg_Model sm = new Libreg_Model();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
    if(bkm.equals(null))
        System.out.print("NULL");
        sm.edit(bkm);
   // }
   return "redirect:libregdtl.htm";
    }
     @RequestMapping(value = "/lib_create",method = RequestMethod.GET)
     public String lib_create(){
      return "libreg_insert";    
     }
    
   @RequestMapping(value = "/libcreat",method = RequestMethod.POST)
    public String insert(@Valid@ModelAttribute(value = "libIns")LiberyReg bkm,BindingResult result,Model m){
    Libreg_Model sm = new Libreg_Model();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.insert(bkm);
   // }
   return "redirect:libregdtl.htm";
    }  
}
