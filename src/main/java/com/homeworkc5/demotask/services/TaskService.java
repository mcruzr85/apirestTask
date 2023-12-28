package com.homeworkc5.demotask.services;

import com.homeworkc5.demotask.dto.request.TaskDtoRequest;


public interface TaskService {
    public void add(TaskDtoRequest taskDtoRequest);
    public void getAll();
}
