package com.example.ejemplitoApi;

public class Group {
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
