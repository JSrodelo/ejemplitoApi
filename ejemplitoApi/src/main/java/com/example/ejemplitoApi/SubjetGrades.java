package com.example.ejemplitoApi;

import java.time.LocalDate;

public class SubjetGrades {
    private Integer idGrades;
    private Integer grades;
    private LocalDate evaluationDate;

    public SubjetGrades() {
    }

    public SubjetGrades(Integer idGrades, Integer grades, LocalDate evaluationDate) {
        this.idGrades = idGrades;
        this.grades = grades;
        this.evaluationDate = evaluationDate;
    }

    public Integer getIdGrades() {
        return idGrades;
    }

    public void setIdGrades(Integer idGrades) {
        this.idGrades = idGrades;
    }

    public Integer getGrades() {
        return grades;
    }

    public void setGrades(Integer grades) {
        this.grades = grades;
    }

    public LocalDate getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(LocalDate evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
}
