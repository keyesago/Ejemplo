package com.example.Ejemplo.Entities;

import java.util.ArrayList;
import java.util.List;

public class taskList {

        private String name ;
        private List<task> taskList;

        public taskList(String name) {
            this.name = name;
            this.taskList = new ArrayList<task>();
        }

        public void addTask(task task){
            this.taskList.add(task);
        }

        public List<task> getTaskList(){
            return this.taskList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }







