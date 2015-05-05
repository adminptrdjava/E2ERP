/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.controller;


import com.demo.model.Book_masterModel;
import com.model.pojo.Bookmaster;

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
public class Bookcontroller {
    @RequestMapping(value = "/bookdtl",method = RequestMethod.GET)
     public String getAll(Model m){
        Book_masterModel sm = new Book_masterModel();
       m.addAttribute("lst",sm.getAll());
        return "Book_master" ;
    
        }          
    
      @RequestMapping(value = "/dell",method = RequestMethod.GET)
    public  String delete(@RequestParam (value = "id")int id){
      Book_masterModel sm =new Book_masterModel();
     Bookmaster ur =new Bookmaster();
      ur=sm.getbyid(id);
      sm.delete(ur);
      return "redirect:bookdtl.htm";    
    }
    
    @RequestMapping(value = "/edtt",method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id")int id,Model m){
    Book_masterModel sm = new Book_masterModel();
    Bookmaster ur = new Bookmaster();
    ur=sm.getbyid(id);
    m.addAttribute("ur",ur);
    return "bookedit";
    }
    
     @RequestMapping(value = "/update1",method = RequestMethod.POST)
    public String update(@Valid@ModelAttribute(value = "bookid")Bookmaster bkm,BindingResult result,Model m){
    Book_masterModel sm = new Book_masterModel();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.edit(bkm);
   // }
   return "redirect:bookdtl.htm";
    }
     @RequestMapping(value = "/create",method = RequestMethod.GET)
     public String create(){
      return "bookinsert";    
     }
    
   @RequestMapping(value = "/creat",method = RequestMethod.POST)
    public String insert(@Valid@ModelAttribute(value = "bookIns")Bookmaster bkm,BindingResult result,Model m){
    Book_masterModel sm = new Book_masterModel();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.insert(bkm);
   // }
   return "redirect:bookdtl.htm";
    }  
}
