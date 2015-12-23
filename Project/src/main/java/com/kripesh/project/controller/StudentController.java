/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.project.controller;

import com.kripesh.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(value = "/Student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
            
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("students", studentService.getAll());
        return "student";
    }
}
