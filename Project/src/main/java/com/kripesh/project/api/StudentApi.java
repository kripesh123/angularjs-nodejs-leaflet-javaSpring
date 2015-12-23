/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.project.api;

import com.kripesh.project.entity.Student;
import com.kripesh.project.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping(value = "/api/student")
public class StudentApi {
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> student(){
        return studentService.getAll();
    }
}
