package com.example.Ejemplo.Entities;

import java.time.LocalDate;

public class task {
    private String descrition;
    private Boolean done ;
    private LocalDate dueDate;

    public task(String descrition, Boolean done, LocalDate dueDate) {
        this.descrition = descrition;
        this.done = done;
        this.dueDate = dueDate;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
