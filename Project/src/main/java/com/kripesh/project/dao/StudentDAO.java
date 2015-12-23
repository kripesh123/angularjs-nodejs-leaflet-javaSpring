/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.project.dao;

import com.kripesh.project.entity.Student;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface StudentDAO {
    
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);
    public List<Student>getAll();
    public Student getByStudentId(int studentId);
}
