package com.example.ejemplitoApi;

import ayudas.TypeUser;

import java.util.Date;


public class Student {
        private Integer idStudent;
        private Integer grade;
        private Date date;
        private String address;

    public Student() {
    }

    public Student(Integer idUser, Integer grade, Date date, String address) {
        this.idStudent = idUser;
        this.grade = grade;
        this.date = date;
        this.address = address;
    }

    public Integer getIdUser() {
        return idStudent;
    }

    public void setIdUser(Integer idUser) {
        this.idStudent = idUser;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
