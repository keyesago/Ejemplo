package com.example.Ejemplo.Services;

import com.example.Ejemplo.Entities.task;
import com.example.Ejemplo.Entities.taskList;

import java.time.LocalDate;

public class taskService {

    task tarea1;
    task tarea3;
    taskList proposito;

    public taskService(){
        this.tarea1 = new task( "aprender",false, LocalDate.of(2022,11,05 ));
        this.tarea3 = new task( "aprender mate ",false, LocalDate.of(2022,11,05 ));
        this.proposito = new taskList("tarea2 ");
        proposito.addTask(tarea1);
        proposito.addTask(tarea3);

    }

    public taskList getTaskList() {
        return this.proposito;
    }
}


