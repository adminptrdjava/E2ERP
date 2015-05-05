/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.controller;


import com.demo.model.Book_masterModel;
import com.demo.model.Bookissue_model;
import com.model.pojo.BookIssuemaster;
import javax.validation.Valid;
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
public class Bookissuecontroller {
    @RequestMapping(value = "/bookissuedtl",method = RequestMethod.GET)
     public String getAll(Model m){
        Bookissue_model sm = new Bookissue_model();
       m.addAttribute("lst",sm.getAll());
        return "bookissue_master" ;
    
        }          
    
      @RequestMapping(value = "/bookissue_del",method = RequestMethod.GET)
    public  String delete(@RequestParam (value = "id")int id){
      Bookissue_model sm =new Bookissue_model();
     BookIssuemaster ur =new BookIssuemaster();
      ur=sm.getbyid(id);
      sm.delete(ur);
      return "redirect:bookissuedtl.htm";    
    }
    
    @RequestMapping(value = "/bookissue_edt",method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id")int id,Model m){
    Bookissue_model sm = new Bookissue_model();
    BookIssuemaster ur = new BookIssuemaster();
    ur=sm.getbyid(id);
    m.addAttribute("ur",ur);
    m.addAttribute("lst2" ,sm.getAll());
    return "Bookissue_edit";
    }
    
     @RequestMapping(value = "/update_bookissue",method = RequestMethod.POST)
    public String update(@Valid@ModelAttribute(value = "bookissueid")BookIssuemaster bkm,BindingResult result,Model m){
    Bookissue_model sm = new Bookissue_model();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.edit(bkm);
   // }
   return "redirect:bookissuedtl.htm";
    }
     @RequestMapping(value = "/bookissue_create",method = RequestMethod.GET)
     public String bookissue_create(Model m){
        Book_masterModel bkm=new Book_masterModel();
        m.addAttribute("lst2",bkm.getAll());
      return "bookissue_insert";    
     }
    
   @RequestMapping(value = "/bookissue_creat",method = RequestMethod.POST)
    public String insert(@Valid@ModelAttribute(value = "bookIssueIns")BookIssuemaster bkm,BindingResult result,Model m){
    Bookissue_model sm = new Bookissue_model();
   /* if(result.hasErrors()){
     m.addAttribute("EMsg","Validation Error");
     m.addAttribute("ur",bkm); 
     return "edit";
    }else{ */
        sm.insert(bkm);
   // }
   return "redirect:bookissuedtl.htm";
    }  
    
}
