package com.example.Ejemplo.Controller;

import com.example.Ejemplo.Entities.taskList;
import com.example.Ejemplo.Services.taskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class taskController {
        taskService service;
        public taskController(){
            this.service = new taskService();


        }

        @GetMapping("/task")
        public taskList taskList(){
            return this.service.getTaskList();
        }
    }


