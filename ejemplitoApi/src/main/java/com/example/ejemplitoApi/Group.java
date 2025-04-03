package com.example.ejemplitoApi;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import javax.naming.Name;

@Entity
@Table(name="groups")


public class Group {

    @Id
    @GenerateValue8s(Stra = GenerationType.IDENTITY)
    @Column(Name = "id_curso")
    private Integer idGroup;
    private String name;

    public Group() {
    }

    public Group(Integer idGroup, String name) {
        this.idGroup = idGroup;
        this.name = name;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
