/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.project.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "students")
public class Student implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "skills")
    private String skill;
    @Column(name = "photo")
    private String photo;
    @Column(name = "resume")
    private String resume;
    @Column(name = "github")
    private String github;
    @Column(name = "slideshare")
    private String slides;
    @Column(name="project_screenshot")
    private String projectScreenshot;
    @Column(name = "recommended")
    private String recommended;
    @Column(name="status")
    private Boolean status;

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, String skill, String photo, String resume, String github, String slides, String projectScreenshot, String recommended, Boolean status) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.skill = skill;
        this.photo = photo;
        this.resume = resume;
        this.github = github;
        this.slides = slides;
        this.projectScreenshot = projectScreenshot;
        this.recommended = recommended;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSlides() {
        return slides;
    }

    public void setSlides(String slides) {
        this.slides = slides;
    }

    public String getProjectScreenshot() {
        return projectScreenshot;
    }

    public void setProjectScreenshot(String projectScreenshot) {
        this.projectScreenshot = projectScreenshot;
    }

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", skill=" + skill + ", photo=" + photo + ", resume=" + resume + ", github=" + github + ", slides=" + slides + ", projectScreenshot=" + projectScreenshot + ", recommended=" + recommended + ", status=" + status + '}';
    }
    
    
    
}
