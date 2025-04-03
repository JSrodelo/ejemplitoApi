package com.example.ejemplitoApi;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;

import java.util.Date;
import java.util.List;


public class Teacher {

    private Integer idTeacher;
    private Date speciality;

    @oneToMany
    @JsonManagedReference
    private list<Group> grupos;


    public Teacher() {
    }

    public Teacher(Integer idTeacher, Date speciality) {
        this.idTeacher = idTeacher;
        this.speciality = speciality;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Date getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Date speciality) {
        this.speciality = speciality;
    }
}
