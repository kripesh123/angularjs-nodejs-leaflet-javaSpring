/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.project.service;

import com.kripesh.project.dao.StudentDAO;
import com.kripesh.project.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentDAO sdao;
    
    public int insert(Student student){
        return sdao.insert(student);
    }
    public int update(Student student){
        return sdao.update(student);
    }
    public int delete(int studentId){
        return sdao.delete(studentId);
    }
    public List<Student> getAll(){
        return sdao.getAll();
    }
    public Student getByStudentId(int studentId){
        return sdao.getByStudentId(studentId);
    }
}
