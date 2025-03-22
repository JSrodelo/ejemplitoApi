package com.example.ejemplitoApi;

import java.util.Date;

public class Teacher {

    private Integer idTeacher;
    private Date speciality;

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
