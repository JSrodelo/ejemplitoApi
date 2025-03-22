
package com.example.ejemplitoApi;
import  java.time.LocalDate;
public class Inscription {
    private Integer idInscription;
    private LocalDate dateInscription;

    public Inscription() {
    }

    public Inscription(Integer idInscription, LocalDate dateInscription) {
        this.idInscription = idInscription;
        this.dateInscription = dateInscription;
    }

    public Integer getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }
}


