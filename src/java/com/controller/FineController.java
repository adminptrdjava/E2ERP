/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;


import com.demo.model.FineModel;
import com.model.pojo.Finesetting;
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
/*THIS IS THE CONTROLLER FOR FINE SETTING*/
@Controller
public class FineController {

    @RequestMapping(value = "/fndtl", method = RequestMethod.GET)
    public String getFnAll(Model m) {
        FineModel fm = new FineModel();
        m.addAttribute("lst", fm.getall());
        return "fndtl";

    }

    @RequestMapping(value = "/fndel", method = RequestMethod.GET)
    public String fndelete(@RequestParam(value = "id") int id) {
        FineModel fm = new FineModel();
        Finesetting fs = new Finesetting();
        fs = fm.getbyid(id);
        fm.delete(fs);
        return "redirect:fndtl.htm";
    }

    @RequestMapping(value = "/fnedt", method = RequestMethod.GET)
    public String fnedit(@RequestParam(value = "id") int id, Model m) {
        FineModel fm = new FineModel();
        Finesetting fs = new Finesetting();
        fs = fm.getbyid(id);
        m.addAttribute("fs", fs);
        return "fnedt";
    }

    @RequestMapping(value = "/fnupdt", method = RequestMethod.POST)
    public String fnupdate(@Valid @ModelAttribute(value = "fs") Finesetting fs, BindingResult result, Model m) {
        FineModel fm = new FineModel();
        /*if (result.hasErrors()) {
         m.addAttribute("EMsg", "Validation Error");
         m.addAttribute("sm", sm);
         return "stfedt";
         //else/ {*/
        fm.edit(fs);

        return "redirect:fndtl.htm";
    }

    @RequestMapping(value = "/fncrt", method = RequestMethod.GET)
    public String fncrt() {
        return "fncrt";
    }

    @RequestMapping(value = "/fncreate", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute(value = "fs") Finesetting fs, BindingResult result, Model m) {
        FineModel fm = new FineModel();
        /*if (result.hasErrors()) {
         m.addAttribute("EMsg", "Validation Error" +result);
         m.addAttribute("cm",cm);
         return "clscrt";
         } else {*/
        fm.insert(fs);

        return "redirect:fndtl.htm";
    }
}
