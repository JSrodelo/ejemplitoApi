package com.example.ejemplitoApi;

public class Subjet {

    private Integer idSubjet;
    private String name;

    public Subjet() {
    }

    public Subjet(Integer idSubjet, String name) {
        this.idSubjet = idSubjet;
        this.name = name;
    }

    public Integer getIdSubjet() {
        return idSubjet;
    }

    public void setIdSubjet(Integer idSubjet) {
        this.idSubjet = idSubjet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
