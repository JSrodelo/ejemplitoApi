package com.example.ejemplitoApi;

import ayudas.TypeUser;

public class User {
    private Integer idUser;
    private String name;
    private String email;
    private String password;
    private String number;
    private TypeUser typeUser;

    public User() {
    }

    public User(Integer idUser, String name, String email, String password, String number, TypeUser typeUser) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.number = number;
        this.typeUser = typeUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
}


