package com.homeworkc5.demotask.repository;

import com.homeworkc5.demotask.dto.request.TaskDtoRequest;

public interface TaskRepository {
    public void add(TaskDtoRequest taskDtoRequest);
    public void getAll();
}
