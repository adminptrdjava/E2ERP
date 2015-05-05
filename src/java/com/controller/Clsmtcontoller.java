/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.model.ClsmtModel;
import com.model.pojo.ClassMaster;
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
/*
 THIS IS THE CONTROLLER FOR CLASS REGISTRAION

 */
@Controller
public class Clsmtcontoller {

    @RequestMapping(value = "/clsdtl", method = RequestMethod.GET)
    public String getClsAll(Model m) {
        ClsmtModel cm = new ClsmtModel();
        m.addAttribute("lst", cm.getall());
        return "clsdtl";

    }

    @RequestMapping(value = "/clsdel", method = RequestMethod.GET)
    public String clsdelete(@RequestParam(value = "id") int id) {
        ClsmtModel clm = new ClsmtModel();
        ClassMaster cm = new ClassMaster();
        cm = clm.getbyid(id);
        clm.delete(cm);
        return "redirect:clsdtl.htm";
    }

    @RequestMapping(value = "/clsedt", method = RequestMethod.GET)
    public String clsedit(@RequestParam(value = "id") int id, Model m) {
        ClsmtModel clm = new ClsmtModel();
        ClassMaster cm = new ClassMaster();
        cm = clm.getbyid(id);
        m.addAttribute("cm", cm);
        return "clsedt";
    }

    @RequestMapping(value = "/clsupdt", method = RequestMethod.POST)
    public String clsupdate(@Valid @ModelAttribute(value = "cm") ClassMaster cm, BindingResult result, Model m) {
        ClsmtModel clm = new ClsmtModel();
        if (result.hasErrors()) {
            m.addAttribute("EMsg", "Validation Error");
            m.addAttribute("cm", cm);
            return "clsedt";
        } else {
            clm.edit(cm);
        }
        return "redirect:clsdtl.htm";
    }

    @RequestMapping(value = "/clscrt", method = RequestMethod.GET)
    public String crt() {
        return "clscrt";
    }

    @RequestMapping(value = "/clscreate", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute(value = "cm") ClassMaster cm, BindingResult result, Model m) {
        ClsmtModel clm = new ClsmtModel();
        if (result.hasErrors()) {
            m.addAttribute("EMsg", "Validation Error" + result);
            m.addAttribute("cm", cm);
            return "clscrt";
        } else {
            clm.insert(cm);
        }
        return "redirect:clsdtl.htm";
    }

}
