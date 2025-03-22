package com.example.ejemplitoApi;

import ayudas.Status;

import java.time.LocalDate;

public class Attendance {
    private Integer idAttendance;
    private LocalDate date;
    private Status attendaceStatus;

    public Attendance() {
    }

    public Attendance(Integer idAttendance, LocalDate date, Status attendaceStatus) {
        this.idAttendance = idAttendance;
        this.date = date;
        this.attendaceStatus = attendaceStatus;
    }

    public Integer getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(Integer idAttendance) {
        this.idAttendance = idAttendance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Status getAttendaceStatus() {
        return attendaceStatus;
    }

    public void setAttendaceStatus(Status attendaceStatus) {
        this.attendaceStatus = attendaceStatus;
    }
}
