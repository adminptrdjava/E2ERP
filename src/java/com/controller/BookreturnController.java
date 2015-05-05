/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.controller;


import com.demo.model.Book_returnModel;
import com.model.pojo.BookReturn;

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
public class BookreturnController {
    @RequestMapping(value = "/bookreturndtl",method = RequestMethod.GET)
     public String getAll(Model m){
        Book_returnModel sm = new Book_returnModel();
       m.addAttribute("lst",sm.getAll());
        return "book-retrunMaster" ;
    
        }          
    
      @RequestMapping(value = "/retrun_del",method = RequestMethod.GET)
    public  String delete(@RequestParam (value = "id")int id){
      Book_returnModel sm =new Book_returnModel();
     BookReturn ur =new BookReturn();
      ur=sm.getbyid(id);
      sm.delete(ur);
      return "redirect:bookreturndtl.htm";    
    }
    
    @RequestMapping(value = "/retrun_edt",method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id")int id,Model m){
    Book_returnModel sm = new Book_returnModel();
    BookReturn ur = new BookReturn();
    ur=sm.getbyid(id);
    m.addAttribute("ur",ur);
    return "bookreturn_edit";
    }
    
     @RequestMapping(value = "/update_returnid",method = RequestMethod.POST)
    public String update(@Valid@ModelAttribute(value = "bookreturnid")BookReturn bkm,BindingResult result,Model m){
    Book_returnModel sm = new Book_returnModel();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.edit(bkm);
   // }
   return "redirect:bookreturndtl.htm";
    }
     @RequestMapping(value = "/retrun_create",method = RequestMethod.GET)
     public String retrun_create(){
      return "bookreturn_insert";    
     }
    
   @RequestMapping(value = "/insert_return",method = RequestMethod.POST)
    public String insert(@Valid@ModelAttribute(value = "bookretrnIns")BookReturn bkm,BindingResult result,Model m){
    Book_returnModel sm = new Book_returnModel();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.insert(bkm);
   // }
   return "redirect:bookreturndtl.htm";
    }  
    
}
