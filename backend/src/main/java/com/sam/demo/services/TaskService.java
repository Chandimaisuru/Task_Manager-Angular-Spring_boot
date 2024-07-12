package com.sam.demo.services;


import com.sam.demo.model.Task;

import com.sam.demo.repositories.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

 private TaskRepository taskRepository;

 @Transactional(readOnly = true)
 public List<Task> getTasks(){
     return taskRepository.findAll();
 }
}
