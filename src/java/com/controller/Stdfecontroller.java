/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;


import com.demo.model.StdfeModel;
import com.model.pojo.StudentFeesDetails;
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
 * @author DIPAK
 */
/*THIS CONTROLLER IS FOR STUDENT FEES DETAILS*/
@Controller
public class Stdfecontroller {

    @RequestMapping(value = "/stfdtl", method = RequestMethod.GET)
    public String getStfAll(Model m) {
        StdfeModel sm = new StdfeModel();
        m.addAttribute("lst", sm.getall());
        return "stfdtl";

    }

    @RequestMapping(value = "/stfdel", method = RequestMethod.GET)
    public String stfdelete(@RequestParam(value = "id") int id) {
        StdfeModel sm = new StdfeModel();
        StudentFeesDetails sd = new StudentFeesDetails();
        sd = sm.getbyid(id);
        sm.delete(sd);
        return "redirect:stfdtl.htm";
    }
    @RequestMapping(value = "/stfedt", method = RequestMethod.GET)
    public String stfedit(@RequestParam(value = "id") int id, Model m) {
        StdfeModel sm =new StdfeModel();
        StudentFeesDetails sd = new StudentFeesDetails();
        sd = sm.getbyid(id);
        m.addAttribute("sd",sd);
        return "stfedt";
    }
@RequestMapping(value = "/stfupdt", method = RequestMethod.POST)
    public String clsupdate(@Valid @ModelAttribute(value = "sd") StudentFeesDetails sd, BindingResult result, Model m) {
        StdfeModel sm =new StdfeModel();
        /*if (result.hasErrors()) {
            m.addAttribute("EMsg", "Validation Error");
            m.addAttribute("sm", sm);
            return "stfedt";
         //else/ {*/
            sm.edit(sd);
        
        return "redirect:stfdtl.htm";
    }
     @RequestMapping(value = "/stfcrt", method = RequestMethod.GET)
    public String crt() {
        return "stfcrt";
    }

    @RequestMapping(value = "/stfcreate", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute(value = "sd") StudentFeesDetails sd, BindingResult result, Model m) {
       StdfeModel sm =new StdfeModel();
        /*if (result.hasErrors()) {
            m.addAttribute("EMsg", "Validation Error" +result);
            m.addAttribute("cm",cm);
            return "clscrt";
        } else {*/
            sm.insert(sd);
        
        return "redirect:stfdtl.htm";
    }
}
