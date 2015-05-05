/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.model.FeeModel;
import com.model.pojo.FeesMaster;
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
/*THIS IS CONTROLLER FOR FEES MASTER*/
@Controller
public class FeeController {

    @RequestMapping(value = "/feedtl", method = RequestMethod.GET)
    public String getFeAll(Model m) {
        FeeModel fm = new FeeModel();
        m.addAttribute("lst", fm.getall());
        return "feedtl";
    }

    @RequestMapping(value = "/fedel", method = RequestMethod.GET)
    public String fndelete(@RequestParam(value = "id") int id) {
        FeeModel fm = new FeeModel();
        FeesMaster fs = new FeesMaster();
        fs = fm.getbyid(id);
        fm.delete(fs);
        return "redirect:feedtl.htm";
    }

    @RequestMapping(value = "/feedt", method = RequestMethod.GET)
    public String fnedit(@RequestParam(value = "id") int id, Model m) {
        FeeModel fm = new FeeModel();
        FeesMaster fs = new FeesMaster();
        fs = fm.getbyid(id);
        m.addAttribute("fs", fs);
        return "feedt";
    }

    @RequestMapping(value = "/feupdt", method = RequestMethod.POST)
    public String fnupdate(@Valid @ModelAttribute(value = "fs") FeesMaster fs, BindingResult result, Model m) {
        FeeModel fm = new FeeModel();
        /*if (result.hasErrors()) {
         m.addAttribute("EMsg", "Validation Error");
         m.addAttribute("sm", sm);
         return "stfedt";
         //else/ {*/
        fm.edit(fs);

        return "redirect:feedtl.htm";
    }

    @RequestMapping(value = "/fecrt", method = RequestMethod.GET)
    public String fncrt() {
        return "fecrt";
    }

    @RequestMapping(value = "/fecreate", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute(value = "fs") FeesMaster fs, BindingResult result, Model m) {
        FeeModel fm = new FeeModel();
        /*if (result.hasErrors()) {
         m.addAttribute("EMsg", "Validation Error" +result);
         m.addAttribute("cm",cm);
         return "clscrt";
         } else {*/
        fm.insert(fs);

        return "redirect:feedtl.htm";
    }
}
