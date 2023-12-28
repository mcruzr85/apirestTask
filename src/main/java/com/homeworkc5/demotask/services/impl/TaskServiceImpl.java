package com.homeworkc5.demotask.services.impl;

import com.homeworkc5.demotask.dto.request.TaskDtoRequest;
import com.homeworkc5.demotask.repository.TaskRepository;
import com.homeworkc5.demotask.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;


public class TaskServiceImpl implements TaskService {
    @Autowired
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void add(TaskDtoRequest taskDtoRequest) {
        taskRepository.add(taskDtoRequest);

    }

    @Override
    public void getAll() {

    }
}
