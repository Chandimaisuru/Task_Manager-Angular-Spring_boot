package com.sam.demo.controller;


import com.sam.demo.model.Task;
import com.sam.demo.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin()
@AllArgsConstructor
public class TaskController {

    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> getTask(){
        return taskService.getTasks();
    }
}
